package modifiers.second;

import modifiers.first.Alpha;

public final class Gamma {

    public static void main(String[] args) {

        Alpha alpha = new Alpha();
        String pub = alpha.pub;
        alpha.publicMethod();

        AlphaChild child = new AlphaChild();
        child.publicMethod();
        final String pub1 = child.pub;
        child.protectedMethod();
    }

}