package sda.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TryMeTaskTest {

    private TryMeTask tryMeTask = new TryMeTask();

    @Test
    public void returnHelloExercise() {
        assertEquals("Hello AdvancedCoding", tryMeTask.returnHelloExercise());
    }
}