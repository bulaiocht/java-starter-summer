package inheritance.biology;

public class Clownfish extends Fish {

    private String name;

    public void clownfishFeature(){
        System.out.println("I like to live in toxic Actiniaria");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clownfish{" +
                "name='" + name + '\'' +
                '}';
    }

}
