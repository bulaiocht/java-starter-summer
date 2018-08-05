package polymorphism.abstractclasses;

public abstract class CrashableCar {

    protected static final int MAX_CAR_STRENGTH = 100;

    public void nonAbstractMethod(){

        System.out.println("Hello");

    }

    public abstract void setCarStrength(int strength);

    public abstract int getCarStrength();

}
