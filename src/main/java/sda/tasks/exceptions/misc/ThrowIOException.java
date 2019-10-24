package sda.tasks.exceptions.misc;

import java.io.IOException;

public class ThrowIOException extends ExecutableForThrow {
    @Override
    public void execute() throws IOException {
        throw new IOException();
    }
}