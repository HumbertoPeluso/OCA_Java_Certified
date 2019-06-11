package chapterone.javabuildingblocks.declaringandinitializingvariables;

public class DeclaringVariables {

    public static void main(String[] args) {
        //Only declaring variables
        String zooName;
        int numberAnimals;

        //initializing variables
        zooName = "The Best Zoo";
        numberAnimals = 100;

        //Declaring multiples variables
        String s1, s2;
        String s3 = "yes", s4 = "no";
        /*Four String variables were declared: s1, s2, s3, and s4. You can declare many variables
        in the same declaration as long as they are all of the same type.*/

        int i1, i2, i3 = 0;
        // 3 variables declared but only one initialized

        // int num, String value; // DOES NOT COMPILE

        boolean b1, b2; // complile
        String t1 = "1", t2; // compile
        //  double d1, double d2; // dont compile
        int g1; int g2; // compile
       // int j3; j4; // dont compile
    }
}
