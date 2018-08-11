package errors.stack;

public class SOECreator extends Thread {

    private void instantSOE(){
        instantSOE();
    }

    @Override
    public void run() {
        instantSOE();
    }
}
