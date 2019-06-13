package chaptertwo.operatorsandstatements.understandingadvancedflowcontrol;

public class ContinueStatement {
   /* While the break statement transfers control to the enclosing statement, the continue
    statement transfers control to the boolean expression that determines if the loop should
continue. In other words, it ends the current iteration of the loop*/
   public static void main(String[]args){

       FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
           for (char x = 'a'; x <= 'c'; x++) {
               if (a == 2 || x == 'b')
                   continue FIRST_CHAR_LOOP;
               System.out.print(" " + a + x); //1a 3a 4a
           }
       }

   }

  /*  Allows optional labels     Allows break statement          Allows continue statement
if          Yes *                    No                                No
while       Yes                      Yes                               Yes
do while    Yes                      Yes                               Yes
for         Yes                      Yes                               Yes
switch      Yes                      Yes                                No
*/


}
