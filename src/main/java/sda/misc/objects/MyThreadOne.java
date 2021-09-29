package sda.misc.objects;

public class MyThreadOne extends Thread {

    private MyObject myObject;

    @Override
    public void run() {
        try {

            System.out.println("Thread one run:");
            myObject.someList.add("O");
            sleep(450);
            myObject.someList.add("O");
            sleep(150);
            myObject.someList.add("O");
            sleep(150);
            myObject.someList.add("O");
            sleep(150);

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
