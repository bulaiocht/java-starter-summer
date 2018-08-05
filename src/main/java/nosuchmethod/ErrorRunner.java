package nosuchmethod;

public class ErrorRunner {

    public static void main(String[] args) {

        Object [] objects = new Object[2];

        objects[0] = new A();

        objects[1] = new B();

        for (Object object : objects) {
            A a = (A) object;
            a.method();
        }

    }


}
