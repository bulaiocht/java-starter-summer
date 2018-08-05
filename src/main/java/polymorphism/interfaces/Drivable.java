package polymorphism.interfaces;

public interface Drivable {

    int MAX_SPEED = 100;

    void drive();

    void stop();

    default void defMethod(){
        System.out.println("I'm default method");
        someOtherMethod();
    }

    private void someOtherMethod(){
        System.out.println("private method");
    }

}
