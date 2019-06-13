package chaptertwo.operatorsandstatements.understandjavastatements;

public class DoWhileStatement {

    public static void main(String[] args) {
        int x = 0;
        do {
            x++;
        } while (false);
        System.out.println(x); // Outputs 1

         //  When to use while vs do-while loops

        // Any while loop can be converted to a do-while loop, and vice versa
        int x1 = 0;
        while (x1 > 10) {
            x1--;
        }
        //  and this do-while loop:
        int x2 = 0;
        if (x2 > 10) {
            do {
                x2--;
            } while (x2 > 10);
        }

        /*Java
        recommends you use a while loop when a loop might not be executed at all and a dowhile loop when the loop is executed at least once. But determining whether you should
        use a while loop or a do-while loop in practice is sometimes about personal preference
        and code readability*/
    }
}
