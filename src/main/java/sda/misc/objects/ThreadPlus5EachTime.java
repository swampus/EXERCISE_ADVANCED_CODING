package sda.misc.objects;

public class ThreadPlus5EachTime extends Thread {

    private Integer[] integer;


    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                sleep(100);
                //  System.out.println("Before: thread 5: [ " + integer[0] + " ] ");
                integer[0] = integer[0] + 5;
                System.out.println("After:  thread 5: [ " + integer[0] + " ] ");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized int getAnInt(int tmp) {
        return 5 + tmp;
    }

    public Integer[] getInteger() {
        return integer;
    }

    public void setInteger(Integer[] integer) {
        this.integer = integer;
    }
}
