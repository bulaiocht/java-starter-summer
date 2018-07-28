package classes;

public class ClassRunner {

    public static void main(String[] args) {

        BrewingMachine.hello();

        BrewingMachine brewingMachine = new BrewingMachine();

        int price = -250;

        String model = "";

        brewingMachine.setPrice(price);
        brewingMachine.setPrice(25, 17);
        brewingMachine.setPrice(25, 17, 26);

        brewingMachine.setModel(model);

        brewingMachine.brewCoffee();

        int coffeePrice = brewingMachine.getPrice();

    }

}
