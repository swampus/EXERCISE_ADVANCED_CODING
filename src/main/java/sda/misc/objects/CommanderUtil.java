package sda.misc.objects;

public class CommanderUtil extends Thread {

    public Integer nextCoordinatesA;
    public Integer nextCoordinatesB;

    @Override
    public void run() {
        try {
            sleep(1000);
            nextCoordinatesA = 1;
            nextCoordinatesB = 1;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
