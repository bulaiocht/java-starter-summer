package polymorphism;

import polymorphism.abstractclasses.CrashableCar;
import polymorphism.interfaces.Drivable;
import polymorphism.interfaces.Swimmable;

public class Car extends CrashableCar implements Drivable, Swimmable {

    private int carStrength;

    @Override
    public void setCarStrength(int strength) {

    }

    @Override
    public int getCarStrength() {
        return 100;
    }

    @Override
    public void drive() {
        System.out.println("I'm driving");
    }

    @Override
    public void stop() {

    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }

    @Override
    public void dive() {
        defMethod();
        System.out.println("I'm going deeper");
    }
}
