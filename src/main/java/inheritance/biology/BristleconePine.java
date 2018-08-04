package inheritance.biology;

public class BristleconePine extends Plant {

    private int age;

    public void bristleconePineFeature(){
        System.out.println("I live for millennia. My current age is " + age);
    }

    @Override
    public void consumeSunEnergy() {
        System.out.println("I don't mind a lot of sun and little of water");
    }

}
