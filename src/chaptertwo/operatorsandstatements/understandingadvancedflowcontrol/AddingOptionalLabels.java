package chaptertwo.operatorsandstatements.understandingadvancedflowcontrol;

public class AddingOptionalLabels {

    /*One thing we skipped when we presented if-then statements, switch statements, and
    loops is that they can all have optional labels. A label is an optional pointer to the head of a
    statement that allows the application flow to jump to it or break from it. It is a single word
    that is proceeded by a colon (:).*/

    public static void main(String[] args) {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }

   /* When dealing with only one loop, they add no value, but as we’ll see in the next section, they are extremely useful in nested environments. Optional labels are often only used
    in loop structures. While this topic is not on the OCA exam, it is possible to add optional
    labels to control and block structures. That said, it is rarely considered good coding practice to do so.*/

}
