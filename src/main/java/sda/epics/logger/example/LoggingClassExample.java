package sda.epics.logger.example;


import org.apache.log4j.Logger;

public class LoggingClassExample {
    //FACTORY Method Pattern
    private final static Logger logger = Logger.getLogger(LoggingClassExample.class);

    public static void main(String args[]) {
        logger.debug("it is [ Debug ] message!");
        logger.info("it is [ Info ] message!");
        logger.warn("it is [ Warning ] message!");

        try {
            Integer integer = Integer.valueOf("asdasd");
        } catch (Exception e) {
            //e.printStackTrace();
            logger.error("Custom Message", e);
        }

    }

}
