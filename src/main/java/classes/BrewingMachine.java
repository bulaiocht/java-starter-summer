package classes;

public class BrewingMachine {

    private String model;

    private int price;

    public void brewCoffee() {
        System.out.println("Hello! I'm " + model + " and you owe me " + price);
    }

    public void setPrice(int price) {
        if (price <= 0) {
            this.price = 50;
        } else this.price = price;
    }

    public void setPrice(int number, int otherNumber){

    }

    public int setPrice(int one, int two, int three){
        return one + two;
    }

    public void setModel(String model) {
        if (model.isEmpty()){
            this.model = "Noname";
        } else this.model = model;
    }

    public int getPrice(){
        return this.price;
    }


    public static BrewingMachine hello(){
        BrewingMachine brewingMachine = new
                BrewingMachine();
        brewingMachine.setPrice(25);
        System.out.println("Hello from static");
        return brewingMachine;
    }
}
