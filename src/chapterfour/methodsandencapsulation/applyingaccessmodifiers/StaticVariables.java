package chapterfour.methodsandencapsulation.applyingaccessmodifiers;

import java.util.ArrayList;

public class StaticVariables {

    /*Some static variables are meant to change as the program runs. Counters are a common
    example of this. We want the count to increase over time. Just as with instance variables,
    you can initialize a static variable on the line it is declared:*/

}

class Initializers {
    private static int counter = 0; // initialization

     /*Other static variables are meant to never change during the program. This type of vari-
     able is known as a constant. It uses the final modifi er to ensure the variable never changes.
     static final constants use a different naming convention than other variables. They use
     all uppercase letters with underscores between “words.” For example:*/

    private static final int NUM_BUCKETS = 45;

    private static final ArrayList<String> values = new ArrayList<>();
    public static void main(String[] args) {
        //    NUM_BUCKETS = 5; // DOES NOT COMPILE - The compiler will make sure that you do not accidentally try to update a fi nal variable

        //  Do you think the following compiles?
        values.add("changed"); // It actually does compile. values is a reference variable

    }


}
