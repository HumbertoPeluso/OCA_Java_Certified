package chapterthree.corejavaapis.understandingjavaarrays;

public class UsingAnArray {
    public static void main(String[]args){

         String[] mammals = {"monkey", "chimp", "donkey"}; //  declares and initializes the array
         System.out.println(mammals.length); // 3 --  tells us how many elements the array can hold
         System.out.println(mammals[0]); // monkey
         System.out.println(mammals[1]); // chimp
         System.out.println(mammals[2]); // donkey

        String[] birds = new String[6];
        System.out.println(birds.length); // 6

        /*It is very common to use a loop when reading from or writing to an array. This loop sets
        each element of number to 5 higher than the current index:*/
         int[] numbers = new int[10];
         for (int i = 0; i < numbers.length; i++)
             numbers[i] = i + 5;

       /* Can you tell why each of these throws an ArrayIndexOutOfBoundsException
        for our array of size 10?*/
        numbers[10] = 3; // indexes 0-9
        numbers[numbers.length] = 5; // length = 10
        for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5; // when i = 10 it goes out of bound


    }
}
