package sda.epics.log.tasks;

import java.io.File;
import java.io.IOException;


public class MyClassToBeLogged {

    //TODO: create logger

    public static void main(String args[]) {
        //TODO: if args are empty log "Arguments are empty" [WARNING]

        File file = new File("asdasdasasd:C/nothing");
        //TODO : log info that we try to open file [DEBUG]
        try {
            boolean f = file.createNewFile();
        } catch (IOException e) {
            //TODO: log exception and message "Can not create new file" [WHAT LAYER SELECT]
        }

        //TODO: log creating new runnable [DEBUG]
        Runnable run = new Runnable() {
            public void run() {
                //LOG that we start run
                for (int i = 0; i < 10; i++) ;
            }
        };

        run.run();

        //TODO: replace System.out it should not be in REAL APP!!!
        System.out.println("Application EXIT!");
    }
}
