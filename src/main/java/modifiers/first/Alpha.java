package modifiers.first;

public class Alpha {

    public String pub;

    private String priv;

    protected String prot;

    String def;

    public void publicMethod(){
        System.out.println("I'm public");
    }

    private void privateMethod(){
        System.out.println("I'm private");
    }

    protected void protectedMethod(){
        System.out.println("I'm protected");
    }

    void defaultMethod(){
        System.out.println("I'm default");
    }

    public void testPrivateMethod(){
        final String priv = this.priv;
        privateMethod();
    }

    public final void finalMethod(){

    }


}
