package sda.tasks.exceptions;

import org.junit.Test;
import sda.misc.ThrowIOException;
import sda.misc.ThrowNotImplementedException;

import java.io.IOException;

import static org.junit.Assert.*;

public class JuniorDeveloperSeniorTest {

    private JuniorDeveloperSenior juniorDeveloperSenior = new JuniorDeveloperSenior();

    @Test
    public void throwRuntimeExceptionWithMessage() {
        try {
            juniorDeveloperSenior.throwRuntimeExceptionWithMessage();
            fail("No exception happens");
        } catch (RuntimeException e) {
            assertEquals("Hello Exception", e.getMessage());
        }

    }

    @Test
    public void rethrowException() {
        try {
            juniorDeveloperSenior.rethrowException();
            fail("No exception happens");
        } catch (RuntimeException e) {
            assertEquals("Hello Exception", e.getMessage());
        }
    }

    @Test
    public void throwOrReturnPlus5() {
        assertEquals(new Integer(-1), juniorDeveloperSenior.throwOrReturnPlus5("NO"));
        assertEquals(new Integer(6), juniorDeveloperSenior.throwOrReturnPlus5("1"));
    }

    @Test
    public void throwCustomException() {
        try {
            juniorDeveloperSenior.throwCustomException();
            fail("No exception happens");
        } catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
            assertNotEquals("java.lang.RuntimeException", e.getClass().getName());
            assertEquals("Hello", e.getMessage());
        }
    }

    @Test
    public void returnValueDependOnException() throws IOException {
        assertEquals(new Integer(-1),
                juniorDeveloperSenior.returnValueDependOnException(new ThrowNotImplementedException()));

        assertEquals(new Integer(-2),
                juniorDeveloperSenior.returnValueDependOnException(new ThrowIOException()));

    }
}