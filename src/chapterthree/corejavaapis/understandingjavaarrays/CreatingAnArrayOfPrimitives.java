package chapterthree.corejavaapis.understandingjavaarrays;

public class CreatingAnArrayOfPrimitives {
    public static void main(String[]args){
       // The most common way to create an array looks like this:
        int[] numbers1 = new int[3]; // 3 is the size of array

      //  Another way to create an array is to specify all the elements it should start out with:
        int[] numbers2 = new int[] {42, 55, 99};

       /* As a shortcut, Java lets you
        write this:*/
        int[] numbers2_ = {42, 55, 99};
        /*This approach is called an anonymous array. It is anonymous because you don’t specify
        the type and size*/

        /*Finally, you can type the [] before or after the name, and adding a space is optional.
                This means that all four of these statements do the exact same thing:*/
        int[] numAnimals;
        int [] numAnimals2;
        int numAnimals3[];
        int numAnimals4 [];

        int[] ids, types; // two variables of type in[] is created
        int ids_[], types_; // one variable int[] and one int is created




    }
}
