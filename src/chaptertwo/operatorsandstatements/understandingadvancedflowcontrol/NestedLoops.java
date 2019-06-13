package chaptertwo.operatorsandstatements.understandingadvancedflowcontrol;

public class NestedLoops {
    public static void main(String[]args){

        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        for(int[] mySimpleArray : myComplexArray) {
            for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }

        System.out.println("..........");

        int x = 20;
        while(x>0) {
            do {
                x -= 2;
            } while (x>5);
            x--;
            System.out.print(x+"\t");
        }

    }

}
