package polymorphism;

import polymorphism.abstractclasses.CrashableCar;
import polymorphism.interfaces.Drivable;
import polymorphism.interfaces.Flyable;

public class AnotherCar extends CrashableCar implements Drivable, Flyable {
    @Override
    public void setCarStrength(int strength) {

    }

    @Override
    public int getCarStrength() {
        return 50;
    }

    @Override
    public void drive() {
        System.out.println("I'm super driving");
    }

    @Override
    public void stop() {

    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void land() {
        System.out.println("I'm landing");
    }
}
