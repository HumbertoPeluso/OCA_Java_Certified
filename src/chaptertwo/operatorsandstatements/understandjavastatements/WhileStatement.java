package chaptertwo.operatorsandstatements.understandjavastatements;

public class WhileStatement {

    public static void main(String[]args){

        // below is an infinite loop and must be avoided
        /*int x = 2;
        int y = 5;
        while(x < 10)
            y++;*/

    }

    public void eatCheese(int bitesOfCheese) {
        int roomInBelly = 5;
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese+" pieces of cheese left");
    }

}
