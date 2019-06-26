package chapterthree.corejavaapis.understandingjavaarrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[]args){
        /*Java makes it easy to sort an array by providing a sort method—or rather, a bunch of sort
        methods. Just like StringBuilder allowed you to pass almost anything to append(), you
        can pass almost any array to Arrays.sort().*/

       // This simple example sorts three numbers:
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
             System.out.print (numbers[i] + " "); // 1 6 9
        System.out.println();

       // Try this again with String types:
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");
        /*This time the result might not be what you expect. This code outputs 10 100 9. The
        problem is that String sorts in alphabetic order*/


    }
}
