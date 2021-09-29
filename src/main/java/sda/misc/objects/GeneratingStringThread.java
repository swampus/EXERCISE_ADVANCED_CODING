package sda.misc.objects;

public class GeneratingStringThread extends Thread {

    private String result;

    public String getResult() {
        return result;
    }

    @Override
    public void run() {
        try {
            sleep(100);
            sleep(200);
            result = "NOT a result currently";
            sleep(100);
            sleep(500);
            result = "OK";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
