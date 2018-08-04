package inheritance;

public class Child extends Parent {

    public static int age = 15;

    String name;

    public Child(){
        super();
        System.out.println("Hello from child's constructor");
    }

    public Child(String name){
        this.name = name;
    }

    public void method(){

        String name = super.name;
        super.sayMyName();
        System.out.println(this.name);

    }

    @Override
    public void sayMyName() {
        System.out.println("I'm a " + this.name + " child of " + super.name);
    }

    public void tellThemAboutYourself(){
        System.out.println("HELLO I'M CHILD");
    }

    public static void staticMethod(){
        System.out.println("I'm child's static method");
    }

}
