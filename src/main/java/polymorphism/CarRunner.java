package polymorphism;

import polymorphism.abstractclasses.CrashableCar;
import polymorphism.interfaces.Drivable;
import polymorphism.interfaces.Flyable;
import polymorphism.interfaces.Swimmable;

public class CarRunner {
    public static void main(String[] args) {

        CrashableCar crashableCar = new Car();
        CrashableCar crashableCar1 = new Car();
        CrashableCar crashableCar2 = new Car();
        CrashableCar crashableCar3 = new AnotherCar();
        CrashableCar crashableCar4 = new AnotherCar();
        CrashableCar crashableCar5 = new AnotherCar();

        printCrashables(crashableCar,
                crashableCar1,
                crashableCar2,
                crashableCar3,
                crashableCar4,
                crashableCar5);

        Drivable drivableCar = new Car();
        Drivable drivableCar1 = new Car();
        Drivable drivableCar2 = new Car();
        Drivable drivableCar3 = new AnotherCar();
        Drivable drivableCar4 = new AnotherCar();
        Drivable drivableCar5 = new AnotherCar();

        printDrivables(drivableCar,
                drivableCar1,
                drivableCar2,
                drivableCar3,
                drivableCar4,
                drivableCar5);

        Car car = new Car();
        AnotherCar anotherCar = new AnotherCar();

        requreFlyable(anotherCar);

        requreSwimmable(car);

        printDrivables(car, anotherCar);

        CrashableCar crashableCar6 = new CrashableCar(){

            @Override
            public void setCarStrength(int strength) {

            }

            @Override
            public int getCarStrength() {
                return 0;
            }
        };

        Swimmable swimmable = new Swimmable() {

            @Override
            public void swim() {

            }

            @Override
            public void dive() {

            }
        };


    }

    static void printCrashables(CrashableCar...cars){
        for (CrashableCar car : cars) {
            System.out.println(car.getCarStrength());
        }
    }

    static void printDrivables(Drivable...drivables){
        for (Drivable drivable : drivables) {
            drivable.drive();
        }
    }

    static void requreSwimmable(Swimmable swimmable){
        swimmable.swim();
        swimmable.dive();
    }

    static void requreFlyable(Flyable flyable){
        flyable.fly();
        flyable.land();
    }

}
