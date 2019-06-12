package chaptertwo.operatorsandstatements.workingwithunaryoperators;

/*      +     Indicates a number is positive, although numbers are assumed
              to be positive in Java unless accompanied by a negative unary
              operator
        -     Indicates a literal number is negative or negates an expression
        ++    Increments a value by 1
        --    Decrements a value by 1
        !     Inverts a Boolean’s logical value*/


public class LogicalComplementAndNegationOperators {

    public static void main(String[] args) {
        boolean x = false;
        System.out.println(x); // false
        x = !x;
        System.out.println(x); // true

        //    "-" reverses the sign of a numeric expression

        double x2 = 1.21;

        System.out.println(x2); // 1.21
        x2 = -x2;
        System.out.println(x2); // -1.21
        x2 = -x2;
        System.out.println(x2); // 1.21

        //   int x = !5; // DOES NOT COMPILE
        // boolean y = -true; // DOES NOT COMPILE
        //  boolean z = !0; // DOES NOT COMPILE


    }

}
