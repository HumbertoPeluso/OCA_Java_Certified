package chaptertwo.operatorsandstatements.usingadditionalbinaryoperators;

public class CompoundAssignmentOperators {
    /*Besides the simple assignment operator, =, there are also numerous compound assignment
    operators. Only two of the compound operators listed in Table 2.1 are required for the
    exam, += and -=*/
    public static void main(String[]args){
        int x = 2, z = 3;
        x = x * z; // Simple assignment operator
        x *= z; // Compound assignment operator

        long x2 = 10;
        int y2 = 5;
      //  y2 = y2 * x2; // DOES NOT COMPILE

        long x3 = 10;
        int y3 = 5;
        y3 *= x3;

        long x4 = 5;
        long y4 = (x4=3);
        System.out.println(x4); // Outputs 3
        System.out.println(y4); // Also, outputs 3
    }

}
