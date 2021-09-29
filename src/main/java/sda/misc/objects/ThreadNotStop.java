package sda.misc.objects;

public class ThreadNotStop extends Thread {

    public int exit = -1;

    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread Stopped OK");
            exit = 0;
        }
    }
}
