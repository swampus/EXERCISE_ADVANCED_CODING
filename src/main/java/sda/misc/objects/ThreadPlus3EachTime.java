package sda.misc.objects;

public class ThreadPlus3EachTime extends Thread {


    private Integer[] integer;


    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                sleep(100);
                //System.out.println("    Before: thread 3: [ " + integer[0] + " ] ");
                integer[0] = integer[0] + 3;
                System.out.println("    After:  thread 3: [ " + integer[0] + " ] ");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized int getAnInt(int tmp) {
        return 3 + tmp;
    }

    public Integer[] getInteger() {
        return integer;
    }

    public void setInteger(Integer[] integer) {
        this.integer = integer;
    }
}
