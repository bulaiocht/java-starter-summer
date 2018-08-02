package inheritance;

public class DomesticCat extends Animal {

    private String name;

    private String ownerName;

    private int age;

    @Override
    public void consumeOrganics() {
        System.out.println("I eat mice");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
