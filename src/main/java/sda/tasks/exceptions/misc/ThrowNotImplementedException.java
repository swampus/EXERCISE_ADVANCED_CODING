package sda.tasks.exceptions.misc;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;

public class ThrowNotImplementedException extends ExecutableForThrow {
    @Override
    public void execute() throws IOException {
        throw new NotImplementedException();
    }
}
