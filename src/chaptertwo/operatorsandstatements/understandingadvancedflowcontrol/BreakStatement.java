package chaptertwo.operatorsandstatements.understandingadvancedflowcontrol;

public class BreakStatement {
   /* As you saw when working with switch statements, a break statement transfers the fl ow
    of control out to the enclosing statement. The same holds true for break statements that
    appear inside of while, do-while, and for loops, as it will end the loop early*/
    public static void main(String[]args){

        int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP: for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                if(list[i][j]==searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if(positionX==-1 || positionY==-1) {
            System.out.println("Value "+searchValue+" not found");
        } else {
            System.out.println("Value "+searchValue+" found at: " +
                    "("+positionX+","+positionY+")");
        }
    }
}
