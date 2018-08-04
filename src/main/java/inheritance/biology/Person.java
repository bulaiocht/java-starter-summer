package inheritance.biology;

public class Person extends Human {

    private String name;

    private int age;

    @Override
    public void consumeOrganics() {
        System.out.println("I love lasagna");
    }
}