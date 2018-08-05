package modifiers.second;

import modifiers.first.Alpha;

public class AlphaChild extends Alpha {

    private final int number = 2;

    void testMethod(){

        final String pub = this.pub;
        final String prot = this.prot;
//        def;
//        priv;

        publicMethod();
        protectedMethod();
//        privateMethod();
//        defaultMethod();

    }

    @Override
    public void protectedMethod() {
        super.protectedMethod();
    }
}
