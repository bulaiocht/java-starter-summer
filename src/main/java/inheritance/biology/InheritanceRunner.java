package inheritance.biology;

public class InheritanceRunner {

    public static void main(String[] args) {

//        Animal animal = new Animal();
//
//        animal.consumeOrganics();
//        animal.breatheOxygen();
//        animal.reproduce();
//        animal.eukaryoteFeature();
//
//
//        Fungi fungi = new Fungi();
//        fungi.fungiFeature();
//        fungi.produceEnzyme();
//        fungi.eukaryoteFeature();

//        Plant plant = new Plant();
//        plant.consumeSunEnergy();
//        plant.eukaryoteFeature();

//        Fish fish = new Fish();
//        fish.eukaryoteFeature();
//        fish.consumeOrganics();
//        fish.breatheOxygen();
//        fish.reproduce();

        Clownfish clownfish = new Clownfish();
        clownfish.setName("Nemo");
        clownfish.eukaryoteFeature();
        clownfish.consumeOrganics();
        clownfish.breatheOxygen();
        clownfish.reproduce();
        clownfish.clownfishFeature();

        System.out.println(clownfish.getName());

        Object object = new Object();
        object.toString();
    }

}
