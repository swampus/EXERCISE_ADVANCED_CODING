package sda.tasks.threads;


import org.junit.Test;
import org.mockito.Mockito;
import sda.misc.objects.MyThreadOne;
import sda.misc.objects.ThreadNotStop;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class JuniorTest {

    private Junior junior = new Junior();

    @Test
    public void startTheGivenThread() {
        MyThreadOne myThreadOne = mock(MyThreadOne.class);
        junior.startTheGivenThread(myThreadOne);
        Mockito.verify(myThreadOne, Mockito.times(1)).start();
        verifyNoMoreInteractions(myThreadOne);
    }

    @Test
    public void createThreadSafeHashMap() {
        assertEquals("java.util.Collections$SynchronizedMap",
                junior.createThreadSafeHashMap().getClass().getName());
    }


    @Test
    public void createSomeThread() {
        assertNotNull(junior.createSomeThread());
    }


    @Test
    public void stopTheThread() {
        ThreadNotStop threadNotStop = new ThreadNotStop();
        threadNotStop.start();
        junior.stopTheThread(threadNotStop);
        try {
            sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(0, threadNotStop.exit);
    }

    @Test
    public void findAlive() {
        MyThreadOne threadOne = new MyThreadOne();
        ThreadNotStop threadNotStop1 = new ThreadNotStop();
        threadNotStop1.setName("T1");
        ThreadNotStop threadNotStop2 = new ThreadNotStop();
        threadNotStop2.setName("T2");
        MyThreadOne threadOne1 = new MyThreadOne();

        threadNotStop2.start();

        List<Thread> runnables = new ArrayList<>();
        runnables.add(threadOne);
        runnables.add(threadNotStop1);
        runnables.add(threadNotStop2);
        runnables.add(threadOne1);

        assertEquals("T2", junior.findAlive(runnables));
    }
}
