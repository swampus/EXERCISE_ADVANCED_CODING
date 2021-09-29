package sda.tasks.threads;


import sda.misc.objects.*;

public class Developer {


    /**
     * You given a object extends thread. Start it
     * After it finish it will provide you a String that you need to return.
     * To get string for result is String getResult()
     * But call it only when thread finish.
     * WAIT UNTIL THREAD FINISH AND GET RESULT : String getResult()
     */
    public String getStringWhenStop(GeneratingStringThread generatingStringThread) {
        return null;
    }


    /**
     * You are given two threads, a) MyThreadOne and b) MyThreadTwo
     * execute both of them, start One start Two, but then after execution threadOne should wait until thread Two Finishes
     */
    public void executeTwoThreadsButSecondOnlyAfterFirstFinish(MyThreadOne myThreadOne,
                                                               MyThreadTwo myThreadTwo)
            throws InterruptedException {


    }


    /**
     * You have a object extends thread, after start that will generate numbers time to time.
     * you can use  Integer getHolder() to load current number (each time interval it will be new)
     * you need calculate all sum of all new values (calculate all values and return sum.) when thread finished return sum
     * each time generated Number will be NEW
     * EACH ITERATION GET HOLDER and SUM with prev values. You understand that new itteration happens when
     * HOLDER IS UPDATED
     */
    public Integer loadValuesFromThreadAndCalculate(GeneratingThread generatingThread) {
        return null;
    }

    /**
     * You are given 3 threads return thread that stops first
     */
    public Thread runningThreadsFindThreadThatEndsFirst(MyThreadOne myThreadOne, MyThreadTwo myThreadTwo,
                                                        ThreadNotStop threadNotStop) {
        return null;
    }


    /**
     * You are given two objects extends Thread. They work with same array final Integer[] integer
     * - you need to modify method RUN in both class, so to make them save work with Integer[] integer
     * - now you get an assert error in Test because working with Integer[0] not thread save.
     * - you can not change method signature change only methods RUN in both class
     */
    public void threadWorksWithSameObjectSave(ThreadPlus5EachTime threadPlus5EachTime,
                                              ThreadPlus3EachTime threadPlus3EachTime,
                                              final Integer[] integer) {

        //NOTHING to do THERE // NOTHING TO CHANGE THERE
        threadPlus5EachTime.setInteger(integer);
        threadPlus3EachTime.setInteger(integer);

        threadPlus5EachTime.start();
        threadPlus3EachTime.start();

    }


}
