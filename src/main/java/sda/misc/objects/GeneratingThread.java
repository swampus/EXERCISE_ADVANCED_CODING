package sda.misc.objects;

public class GeneratingThread extends Thread {

    private Integer holder = 0;

    public Integer getHolder() {
        return holder;
    }

    @Override
    public void run() {
        try {
            sleep(200);
            holder = 15;
            sleep(300);
            holder = 5;
            sleep(300);
            holder = 10;
            sleep(300);
            holder = 11;
            sleep(100);
            holder = 1;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

