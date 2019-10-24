package sda.tasks.exceptions.misc;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;

public class Utils {
    public static void methodThatWillFail() throws IOException {
        throw new IOException("Hello Exception");
    }

    public static void notImplementedException() throws NotImplementedException {
        throw new NotImplementedException();
    }

    public static void throwIOexception() throws IOException {
        throw new IOException();
    }
}
