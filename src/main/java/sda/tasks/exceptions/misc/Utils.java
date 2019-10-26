package sda.tasks.exceptions.misc;


import java.io.IOException;

public class Utils {
    public static void methodThatWillFail() throws IOException {
        throw new IOException("Hello Exception");
    }

    public static void notImplementedException() throws ExceptionInInitializerError {
        throw new ExceptionInInitializerError();
    }

    public static void throwIOexception() throws IOException {
        throw new IOException();
    }
}
