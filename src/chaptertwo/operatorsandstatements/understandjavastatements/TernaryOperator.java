package chaptertwo.operatorsandstatements.understandjavastatements;

public class TernaryOperator {

    /*The conditional operator, ? :, otherwise known as the ternary operator, is the only operator
    that takes three operands and is of the form:
    booleanExpression ? expression1 : expression2*/

    public static void main(String[] args) {

        /*The fi rst operand must be a boolean expression, and the second and third can be any
        expression that returns a value. The ternary operation is really a condensed form of an ifthen-else statement that returns a value. For example, the following two snippets of code
        are equivalent:*/

        int y = 10;
        final int x;
        if (y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }

        int y1 = 10;
        int x1 = (y1 > 5) ? (2 * y1) : (3 * y1); //Parenthesis not required

       /* There is no requirement that second and third expressions in ternary operations have
        the same data types, although it may come into play when combined with the assignment
        operator.*/

        System.out.println((y > 5) ? 21 : "Zebra");

        // int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE


    }

}
