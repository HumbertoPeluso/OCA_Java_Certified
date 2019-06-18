package chaptertwo.operatorsandstatements.understandingjavaoperators;

/*A Java operator is a special symbol that can be applied to a set of variables, values, or
        literals—referred to as operands—and that returns a result. Three fl avors of operators are
        available in Java: unary, binary, and ternary*/
public class JavaOperators {

    public static void main(String[] args){
        int y = 4;
        double x = 3 + 2 * --y;

        System.out.println(y); //3
        System.out.println(x); // 9.0

    }

    /*Post-unary operators:  expression++, expression--
      Pre-unary operators:  ++expression, --expression
      Other unary operators: +, -, !
      Multiplication/Division/Modulus:  *, /, %
      Addition/Subtraction:  +, -
      Shift operators:  <<, >>, >>>
      Relational operators:  <, >, <=, >=, instanceof
      Equal to/not equal to:  ==, !=
      Logical operators: &, ^, |
      Short-circuit logical operators: &&, ||
      Ternary operators:  boolean expression ? expression1 : expression2
      Assignment operators: =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=*/


}
