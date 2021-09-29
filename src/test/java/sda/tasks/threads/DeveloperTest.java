package sda.tasks.threads;

import org.junit.Test;
import sda.misc.objects.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer = new Developer();

    @Test
    public void getStringWhenStop() {
        GeneratingStringThread generatingStringThread = new GeneratingStringThread();
        assertEquals("OK", developer.getStringWhenStop(generatingStringThread));
    }


    @Test
    public void startMyThreadOneStartMyThreadTwoMakeMyThreadOneWaitThreadTwo() throws InterruptedException {
        final List<String> strs = new ArrayList<String>();
        MyObject myObject = new MyObject(strs);


        MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.setMyObject(myObject);


        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.myThreadOne = myThreadOne;
        myThreadTwo.setMyObject(myObject);

        developer.executeTwoThreadsButSecondOnlyAfterFirstFinish(myThreadOne, myThreadTwo);


        while (myThreadOne.isAlive() || myThreadTwo.isAlive()) {
            sleep(1000);
        }


        System.out.println(Arrays.toString(new List[]{myObject.someList}));
        assertEquals("O", myObject.someList.get(0));
        assertEquals("T", myObject.someList.get(1));
        assertEquals("T", myObject.someList.get(2));
        assertEquals("T", myObject.someList.get(3));
        assertEquals("T", myObject.someList.get(4));
        assertEquals("O", myObject.someList.get(5));
        assertEquals("O", myObject.someList.get(6));
        assertEquals("O", myObject.someList.get(7));
    }


    @Test
    public void loadValuesFromThreadAndCalculate() {
        Integer sum = developer.loadValuesFromThreadAndCalculate(new GeneratingThread());
        assertEquals(new Integer(42), sum);
    }

    @Test
    public void runningThreadsFindThreadThatEndsFirst() {
        final List<String> strs = new ArrayList<String>();
        MyObject myObject = new MyObject(strs);

        MyThreadOne myThreadOne = new MyThreadOne();
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        ThreadNotStop threadNotStop = new ThreadNotStop();

        myThreadOne.setMyObject(myObject);
        myThreadTwo.setMyObject(myObject);

        myThreadOne.start();
        myThreadTwo.start();


        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(myThreadTwo, developer.runningThreadsFindThreadThatEndsFirst(myThreadOne,
                myThreadTwo, threadNotStop));
    }

    @Test
    public void threadWorksWithSameObjectSave() throws InterruptedException {

        ThreadPlus3EachTime threadPlus3EachTime = new ThreadPlus3EachTime();
        ThreadPlus5EachTime threadPlus5EachTime = new ThreadPlus5EachTime();

        Integer[] integer = new Integer[1];
        integer[0] = 1;

        threadPlus5EachTime.setInteger(integer);

        threadPlus3EachTime.setInteger(integer);

        developer.threadWorksWithSameObjectSave(threadPlus5EachTime, threadPlus3EachTime, integer);

        while (threadPlus3EachTime.isAlive() || threadPlus5EachTime.isAlive()) {
            sleep(1000);
        }


        assertEquals(new Integer(81), integer[0]);

        //second check
        threadPlus3EachTime = new ThreadPlus3EachTime();
        threadPlus5EachTime = new ThreadPlus5EachTime();

        integer = new Integer[1];
        integer[0] = 2;

        threadPlus5EachTime.setInteger(integer);

        threadPlus3EachTime.setInteger(integer);

        developer.threadWorksWithSameObjectSave(threadPlus5EachTime, threadPlus3EachTime, integer);

        while (threadPlus3EachTime.isAlive() || threadPlus5EachTime.isAlive()) {
            sleep(1000);
        }

        assertEquals(new Integer(82), integer[0]);

        //third check
        threadPlus3EachTime = new ThreadPlus3EachTime();
        threadPlus5EachTime = new ThreadPlus5EachTime();

        integer = new Integer[1];
        integer[0] = 7;

        threadPlus5EachTime.setInteger(integer);

        threadPlus3EachTime.setInteger(integer);

        developer.threadWorksWithSameObjectSave(threadPlus5EachTime, threadPlus3EachTime, integer);

        while (threadPlus3EachTime.isAlive() || threadPlus5EachTime.isAlive()) {
            sleep(1000);
        }

        assertEquals(new Integer(87), integer[0]);

    }


}