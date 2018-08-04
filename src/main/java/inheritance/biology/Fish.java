package inheritance.biology;

public class Fish extends Animal {

    @Override
    public void reproduce() {
        System.out.println("I use caviar");
    }

    @Override
    public void breatheOxygen() {
        System.out.println("I breathe oxygen dissolved in water");
    }

}
