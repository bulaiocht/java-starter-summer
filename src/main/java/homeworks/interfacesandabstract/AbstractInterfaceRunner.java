package homeworks.interfacesandabstract;

import java.util.Arrays;

public class AbstractInterfaceRunner {

    public static void main(String[] args) {

        Flyable f1 = new TransportPlane();
        Flyable f2 = new SportPlane();
        Flyable f3 = new WaterPlane();

        Flyable [] flyables = new Flyable[3];

        flyables[0] = f1;
        flyables[1] = f2;
        flyables[2] = f3;

        for (Flyable flyable : flyables) {
            flyable.land();
        }

        AbstractMachine a1 = new TransportPlane();
        AbstractMachine a2 = new SportPlane();
        AbstractMachine a3 = new WaterPlane();

        AbstractMachine [] machines = new AbstractMachine[3];

        machines[0] = a1;
        machines[1] = a2;
        machines[2] = a3;

        for (AbstractMachine machine : machines) {
            machine.stopEngine();
        }


    }
}
