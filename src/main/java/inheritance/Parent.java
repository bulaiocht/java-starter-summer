package inheritance;

public class Parent {

    public static int age = 10;

    String name;

    public Parent() {
        super();

        name = "Anonimus";

        System.out.println("Hello from parent's constructor");
    }

    public void sayMyName() {
        System.out.println(name);
    }

    public static void staticMethod(){
        System.out.println("I'm parent's static method");
    }
}
