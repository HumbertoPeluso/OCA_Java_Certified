package chaptertwo.operatorsandstatements.workingwithbinaryarithmeticoperators;

public class NumericPromotion {
//rules:
    /* 1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
       2. If one of the values is integral and the other is floating-point, Java will automatically
          promote the integral value to the floating-point value’s data type.
       3. Smaller data types, namely byte, short, and char, are first promoted to int any time
          they’re used with a Java binary arithmetic operator, even if neither of the operands is
          int.
       4. After all promotion has occurred and the operands have the same data type, the resulting
          value will have the same data type as its promoted operands.*/
    public static void main(String[] args) {
        int x1 = 1;
        long y1 = 33;

       // int result = x1*y1; // not compile
        long result1 = x1*1;

        double x2 = 39.21;
       // float y2 = 2.1;  //fl foating-point literals are assumed to be double, unless postfixed with an f, as in 2.1f

        short x3 = 10;
        short y3 = 3;

       // short result3 = x3/y3; // not compile because of rule 3
        int result3 = x3/y3; //this compiles


        short x4 = 14;
        float y4 = 13;
        double z4 = 30;

       // short result4 = x4*y4/z4; // not compiles because of rule 3
      //  float result4 = x4*y4/z4; // not compile because of rule 2

        double result4 = x4*y4/z4; // it compiles because foating-point literals are assumed to be double



    }

}
