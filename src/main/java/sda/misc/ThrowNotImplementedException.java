package sda.misc;


import java.io.IOException;

public class ThrowNotImplementedException extends ExecutableForThrow {
    @Override
    public void execute() throws IOException {
        throw new ExceptionInInitializerError();
    }
}
