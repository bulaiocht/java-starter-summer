package coffee;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.InputMismatchException;
import java.util.Scanner;

@Data
@NoArgsConstructor
public class CoffeeMachine {

    private static final String COIN = "" +
            "     ,---.\n" +
            "    ' __O>`\n" +
            "   ( (__/  )\n" +
            "    .-----,\n" +
            "     `---'\n";

    private static final String COFFEE = "" +
            "     $    $    $  \n" +
            "        $    $    \n" +
            "   [=============]\n" +
            "    \\           /\n" +
            "     \\         /\n" +
            "      \\       /\n" +
            "       \\     /\n" +
            "        -----\n";

    private int funds;

    private String model;

    private int coffeeBeans;

    private int water;

    private int milk;

    public CoffeeMachine(String model, int water, int milk, int coffeeBeans) {
        this.model = model;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
    }

    public void makeCoffee(String coffeeType, int amount){
        CoffeeType type;
        try {
            type = checkType(coffeeType);
        } catch (IllegalArgumentException e) {
            System.out.printf("Sorry, no such coffee \"%s\" available at the moment.", coffeeType);
            refund(amount);
            return;
        }

        boolean suffice = checkAmount(type, amount);

        boolean machineReady = checkResources(type);

        if (!machineReady){
            refund(amount);
            return;
        }
        if (suffice){
            water -= type.water;
            milk -= type.milk;
            coffeeBeans -= type.coffeeBeans;
            funds += amount;
            printCoffee();
        }
    }

    private void printCoffee() {
        System.out.println("Here is your coffee:");
        System.out.println(COFFEE);
    }

    private void refund(int amount) {
        System.out.printf("Sorry we are short on resources, here's your money back: %d \n", amount);
        printCoins();
    }

    private void printCoins() {
        System.out.println(COIN);
    }

    private boolean checkResources(CoffeeType type) {
        return water >= type.water
                && milk >= type.milk
                && coffeeBeans >= type.coffeeBeans;
    }

    private boolean checkAmount(CoffeeType type, int amount) {
        final int price = type.price;
        return amount >= price;
    }

    private CoffeeType checkType(String coffeeType) {
        return CoffeeType.valueOf(coffeeType.toUpperCase());
    }

    public enum CoffeeType {

        MOCHA (20, 10, 10, 12),
        CAPUCCINO (25, 10, 15, 12),
        AMERICANO (15, 10, 0, 10),
        ESPRESSO (20, 20, 0, 15);

        private int price;

        private int water;

        private int milk;

        private int coffeeBeans;

        CoffeeType(int price, int water, int milk, int coffeeBeans) {
            this.price = price;
            this.water = water;
            this.milk = milk;
            this.coffeeBeans = coffeeBeans;

        }
    }

    public static void main(String[] args) {

        CoffeeMachine machine = new CoffeeMachine("Coffeenator", 200, 200, 200);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert coins:");

        int inserted = 0;

        boolean ok = true;

        while (ok){
            try {
                inserted = scanner.nextInt();
                ok = false;
            } catch (InputMismatchException e) {
                System.out.println("Naah... Try again.");
                ok = true;
            }
        }

        if (inserted<=0){
            System.out.println("Coins rejected. Have a nice day.");
            return;
        }

        System.out.printf("%d credits available.\n", inserted);

        System.out.println("Choose your coffee type:");
        final CoffeeType[] values = CoffeeType.values();
        for (CoffeeType value : values) {
            System.out.printf("%s: %d coins \n", value.name(), value.price);
        }
        System.out.println();

        String chosen = scanner.next();

        machine.makeCoffee(chosen, inserted);

    }

}
