package modifiers.first;

import modifiers.second.AlphaChild;

public class Beta {

    public static void main(String[] args) {

        Alpha alpha = new Alpha();

        final String pub = alpha.pub;
        final String prot = alpha.prot;
        final String def = alpha.def;
//        final String priv = alpha.priv;
        alpha.publicMethod();
        alpha.defaultMethod();
        alpha.protectedMethod();
        alpha.testPrivateMethod();
    }
}
