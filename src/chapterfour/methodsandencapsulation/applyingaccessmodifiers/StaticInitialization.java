package chapterfour.methodsandencapsulation.applyingaccessmodifiers;

public class StaticInitialization {

    /*They add the static keyword to specify they
    should be run when the class is fi rst used. For example:*/

    private static final int NUM_SECONDS_PER_HOUR;
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }

  //  The static initializer runs when the class is fi rst used.

  //  Let’s try another example to make sure you understand the distinction:

    private static int one;

    private static final int two;

    private static final int three = 3;

  //  private static final int four; // DOES NOT COMPILE - declares a final variable that never gets initialized

    static {
        one =1;
        two = 2;
      //  three = 3; // DOES NOT COMPILE - We are not allowed to assign it again
      //  two = 4; // DOES NOT COMPILE - doesn’t compile because this is the second attempt

    }

}
