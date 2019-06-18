package chaptertwo.operatorsandstatements.usingadditionalbinaryoperators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean a, b;

    /*//  Operation     Meaning                       Note
    //  ---------     -------                       ----
        a && b     logical AND                    short-circuiting
        a || b     logical OR                     short-circuiting
        a &  b     boolean logical AND            not short-circuiting
        a |  b     boolean logical OR             not short-circuiting
        a ^  b     boolean logical exclusive OR
        !a          logical NOT

        short-circuiting        (x != 0) && (1/x > 1)   SAFE
        not short-circuiting    (x != 0) &  (1/x > 1)   NOT SAFE*/

        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        System.out.println(x);

        boolean x2 = true, z2 = true;
        int y2 = 20;
        x2 = (y2 != 10) ^ (z2 = false);
        System.out.println(x2 + ", " + y2 + ", " + z2);


    }
}
