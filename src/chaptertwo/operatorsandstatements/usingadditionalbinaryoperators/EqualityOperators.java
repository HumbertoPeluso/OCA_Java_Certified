package chaptertwo.operatorsandstatements.usingadditionalbinaryoperators;

import java.io.File;

public class EqualityOperators {

    public static void main(String[]args){

        /*  1. Comparing two numeric primitive types. If the numeric values are of different data
               types, the values are automatically promoted as previously described. For example,
               5 == 5.00 returns true since the left side is promoted to a double.
            2. Comparing two boolean values.
            3. Comparing two objects, including null and String values.*/

        // boolean x = true == 3; // DOES NOT COMPILE
        // boolean y = false != "Giraffe"; // DOES NOT COMPILE
        // boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE

        boolean y = false;
        boolean x = (y = true);
        System.out.println(x); // Outputs true

        File x1 = new File("myFile.txt");
        File y1 = new File("myFile.txt");
        File z1 = x1;
        System.out.println(x1 == y1); // Outputs false
        System.out.println(x1 == z1); // Outputs true

    }

}
