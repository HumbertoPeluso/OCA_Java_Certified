package chaptertwo.operatorsandstatements.understandjavastatements;

public class ForStatements {

    public static void main(String[] args) {


       /* for(initialization; booleanExpression; updateStatement) {
            // Body
        } */

        //  Let’s take a look at an example that prints the numbers 0 to 9:

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        // 1. Creating an Infinite Loop
      /*  for( ; ; ) {
            System.out.println("Hello World");
        }*/

        System.out.println("");
        System.out.println("..........");

        //  2. Adding Multiple Terms to the for Statement
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);

        System.out.println("");
        System.out.println("..........");

        //   3. Redeclaring a Variable in the Initialization Block
       /* int x1 = 0;
        for(long y1 = 0, x1 = 4; x1 < 5 && y1 < 10; x1++, y1++) { // DOES NOT COMPILE
            System.out.print(x1 + " ");
        }*/

        int x2 = 0;
        long y2 = 10;
        for(y2 = 0, x2 = 4; x2 < 5 && y2 < 10; x2++, y2++) {
            System.out.print(x + " ");
        }


     //   4. Using Incompatible Data Types in the Initialization Block
        /*for(long y3 = 0, int x3 = 4; x < 5 && y3<10; x3++, y3++) { // DOES NOT COMPILE
            System.out.print(x + " ");
        }*/

     //   5. Using Loop Variables Outside the Loop
        for(long y4 = 0, x4 = 4; x4 < 5 && y4 < 10; x4++, y4++) {
            System.out.print(y4 + " ");
        }
     //   System.out.print(x4); // DOES NOT COMPILE


    }

}
