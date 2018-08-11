package io;

import java.io.Serializable;

@CustomClassAnnotation(param = "Hello World", number = 12)
public class TestClass implements Serializable {

    private static final int intField = 10;

    private String className = "Thi is TestClass";

    private String stringField;

    public TestClass() {
    }

    public TestClass(String stringField) {
        this.stringField = stringField;
    }

    public String getStringField(){

        return this.stringField;

    }

    @CustomMethodAnnotation(argument = 10)
    private void privateMethod(){
        int variable = 0;
        System.out.println(variable);
        System.out.println("I'm private");

    }


}
