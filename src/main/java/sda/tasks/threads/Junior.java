package sda.tasks.threads;

import sda.misc.objects.MyThreadOne;
import sda.misc.objects.ThreadNotStop;

import java.util.List;
import java.util.Map;

public class Junior {

    /**
     * you are provided MyThreadOne extends thread (Thread). Start it()
     * what is Diffrence between start and run methods ?
     */
    public void startTheGivenThread(MyThreadOne threadOne) {

    }

    /**
     * Create Threadsave HashMap<String,Integer>
     * use static methods of java.util.Collections Class
     */
    public Map<String, Integer> createThreadSafeHashMap() {
        return null;
    }

    /**
     * Create something runnable, may be something from class that exists in project or new
     * Just create and return something Runnable (may be empty)
     */
    public Runnable createSomeThread() {
        return null;
    }

    /**
     * You are given object extends thread. It IS RUNNING
     * INTTERUPT IT!;
     */
    public void stopTheThread(ThreadNotStop threadNotStop) {

    }

    /**
     * You have a List with threads find any a name of a thread that still alive.
     * USE Stream API
     */
    public String findAlive(List<Thread> left4dead) {
        return null;
    }


}
