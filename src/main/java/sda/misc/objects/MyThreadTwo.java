package sda.misc.objects;

public class MyThreadTwo extends Thread {

    private MyObject myObject;
    public MyThreadOne myThreadOne;

    @Override
    public void run() {
        try {
            System.out.println("Thread two run:");
            myObject.someList.add("T");
            sleep(150);
            myObject.someList.add("T");
            sleep(100);
            myObject.someList.add("T");
            sleep(100);
            myObject.someList.add("T");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public MyObject getMyObject() {
        return myObject;
    }

    public void setMyObject(MyObject myObject) {
        this.myObject = myObject;
    }
}
