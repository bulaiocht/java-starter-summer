package errors.stack;

public class TimedSOECreator extends Thread {

    private void timedSOE(){

        try {

            Thread.sleep(1);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        timedSOE();

    }

    @Override
    public void run() {
        timedSOE();
    }

}
