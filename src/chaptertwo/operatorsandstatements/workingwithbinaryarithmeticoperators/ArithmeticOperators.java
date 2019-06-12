package chaptertwo.operatorsandstatements.workingwithbinaryarithmeticoperators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int x = 2 * 5 + 3 * 4 - 8; //14

        System.out.println(x);

        int y = 2 * ((5 + 3) * 4 - 8); //48

        System.out.println(y);

        System.out.println(9 / 3); // Outputs 3
        System.out.println(9 % 3); // Outputs 0

        System.out.print(10 / 3); // Outputs 3
        System.out.print(10 % 3); // Outputs 1

        System.out.print(11 / 3); // Outputs 3
        System.out.print(11 % 3); // Outputs 2

        System.out.print(12 / 3); // Outputs 4
        System.out.print(12 % 3); // Outputs 0
    }
}
