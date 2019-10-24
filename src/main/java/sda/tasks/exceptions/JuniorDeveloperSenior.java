package sda.tasks.exceptions;

import sda.tasks.exceptions.misc.ExecutableForThrow;

import java.io.IOException;

public class JuniorDeveloperSenior {

    /**
     * throw runtimeException with message "Hello Exception"
     */
    public void throwRuntimeExceptionWithMessage() {

    }

    /**
     * Call static Utils.methodThatWillFail
     * catch exception it throws. Get the message.
     * throw RuntimeException with same message
     */
    public void rethrowException() {

    }

    /**
     * Return -1 if exceptions happens, otherWise return input paramether + 5 (Integer)
     */
    public Integer throwOrReturnPlus5(String someInt) {
        return null;
    }

    /**
     * Create Exception that extends Runtime exception and throw
     * it with message "Hello"
     * 1) Create new Class Extends RuntimeException
     * 2) Throw it
     */
    public void throwCustomException() {

    }

    /**
     * return -1 if NotImplementedException Happens
     * return -2 if IOexception happens
     * Start with:: executableForThrow.execute()
     */
    public Integer returnValueDependOnException(ExecutableForThrow executableForThrow)
            throws IOException {

        return null;
    }
}
