package sda.tasks.threads;

/**
 * USE LOGGER. Log each action with DEBUG
 * Cover everything with JUNIT tests
 */
public class Senior {


    /**
     * Starts at (0,0)
     * Field
     * 0 1 2 3 4 5 6 7 8 9
     * 1
     * 2 X
     * 3
     * 4       X
     * 5
     * 6
     * 7
     * 8
     * 9
     */

    /**
     *   CREATE TWO object - threads a) Runner b) Commander
     *   Commander starts CommanderUtil thread (created). Utils have method getNextCoordinates
     *   that method will produces new A coordinate and B coordinate like (1,2) (4,4) marked with X
     *   Then commander converts it to List<String> of commands like  (RIGHT, DOWN, DOWN) to reach coordinate
     *   Then it puts that to some shared List<String> allow Runner to consume it, then runners start to run,
     *   Run is: from init coordinate execute command reach new coordinate and mark it with O, next step (RIGHT DOWN, DOWN,
     *   execution begins from that coordinate)
     *   Runner can run only once per 1 second
     *   Log every step, and system out field array every step
     *   When there is no new cordinaates more then 5 second, finish everything
     */


    /**
     * New Coordinates (2,3)
     *
     * 0 1 2 3 4 5 6 7 8 9
     * 1
     * 2
     * 3   X
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     *
     * List<String> DOWN,DOWN,DOWN,RIGHT,RIGHT
     * 0 1 2 3 4 5 6 7 8 9
     * o
     * o
     * o o o
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     */

    /**
     * New Coordinates (4,4)
     *
     * 0 1 2 3 4 5 6 7 8 9
     * 1
     * 2
     * 3   X
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     *
     * List<String> DOWN,DOWN,DOWN,RIGHT,RIGHT
     * 0 1 2 3 4 5 6 7 8 9
     * o
     * o
     * o o o
     * 4       X
     * 5
     * 6
     * 7
     * 8
     * 9
     *
     */

    /*
     * List<String> RIGHT,RIGHT,DOWN
     * 0 1 2 3 4 5 6 7 8 9
     * o
     * o
     * o o o
     * 4       X
     * 5
     * 6
     * 7
     * 8
     * 9
     */

    /*
     * List<String> RIGHT,RIGHT,DOWN
     * 0 1 2 3 4 5 6 7 8 9
     * o
     * o
     * o o o o o
     * 4       o
     * 5
     * 6
     * 7
     * 8
     * 9
     */


}
