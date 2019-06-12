package chaptertwo.operatorsandstatements.workingwithunaryoperators;

public class IncrementAndDecrementOperators {

    public static void main(String[]args){
        int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x); //2
        System.out.println("y is " + y); //7

    }
}
