package anonclasses;

public class AnonClassRunner {
    public static void main(String[] args) {

        DummyInterface dummy = new DummyInterface() {
            private String name = this.getClass().getName();
            @Override
            public void doSomething() {
                System.out.println(this.name + ": " + "Doing something");
            }

            @Override
            public String returnString() {
                return this.name + ": Returning this string";
            }
        };

        dummy.doSomething();

        System.out.println(dummy.returnString());

        DummyFunctionalInterface summation = new DummyFunctionalInterface() {
            private String name = this.getClass().getName();
            @Override
            public void process(int first, int second) {
                System.out.println(this.name + ": " +  (first + second));
            }
        };

        DummyFunctionalInterface average = new DummyFunctionalInterface() {
            private String name = this.getClass().getName();
            @Override
            public void process(int first, int second) {
                System.out.println(this.name + ": " + (first + second)/2);
            }
        };

        DummyFunctionalInterface division = new DummyFunctionalInterface() {
            private String name = this.getClass().getName();
            @Override
            public void process(int first, int second) {
                System.out.println(this.name + ": " + first/second);
            }
        };

        summation.process(10, 12);
        average.process(10, 12);
        division.process(10, 2);

        //Lambdas are cool!
        //But different
        DummyFunctionalInterface lambdaSummation = (first, second) -> System.out.println();

        DummyFunctionalInterface lambdaAverage = (first, second) -> System.out.println((first + second)/2);

        DummyFunctionalInterface lambdaDivision = (first, second) -> System.out.println(first/second);

        lambdaSummation.process(10, 12);
        lambdaAverage.process(10, 12);
        lambdaDivision.process(10, 2);

        DummyAbsClass dummyAbsClass = new DummyAbsClass() {

            private String name = this.getClass().getName();

            @Override
            public void say() {
                System.out.println(this.name);
            }
        };

        dummyAbsClass.say();

    }
}
