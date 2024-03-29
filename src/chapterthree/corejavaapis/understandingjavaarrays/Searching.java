package chapterthree.corejavaapis.understandingjavaarrays;

import java.util.Arrays;

public class Searching {
    public static void main(String[]args){
     //   Java also provides a convenient way to search—but only if the array is already sorted.

        /*Scenario                                          Result

        Target element found in sorted array               Index of match

        Target element not found in sorted array           Negative value showing one smaller than the
                                                           negative of index, where a match needs to be
                                                           inserted to preserve sorted order

        Unsorted array                                     A surprise—this result isn’t predictable*/



       // Let’s try out these rules with an example:
         int[] numbers = {2,4,6,8}; // sorted array
         System.out.println(Arrays.binarySearch(numbers, 2)); // 0 -- searches for the index of 2. The answer is index 0
         System.out.println(Arrays.binarySearch(numbers, 4)); // 1 --  index of 4, which is 1.
         System.out.println(Arrays.binarySearch(numbers, 1)); // -1 -- searches for the index of 1. Although 1 isn’t in the list, the search can determine
                                                                   //that it should be inserted at element 0 to preserve the sorted order. Since 0 already means
                                                                   //something for array indexes, Java needs to subtract 1 to give us the answer of –1
         System.out.println(Arrays.binarySearch(numbers, 3)); // -2 --  3 isn’t in the list, it would need to be inserted at element 1 to preserve
                                                                   // the sorted order. We negate and subtract 1 for consistency, getting –1 –1, also known as –2
         System.out.println(Arrays.binarySearch(numbers, 9)); // -5 --  wants to tell us that 9 should be inserted at index 4. We again negate and
                                                                   // subtract 1, getting –4 –1, also known as –5.

       // What do you think happens in this example?
         int[] numbers2 = new int[] {3,2,1};
         System.out.println(Arrays.binarySearch(numbers2, 2));
         System.out.println(Arrays.binarySearch(numbers2, 3));
    }
}
