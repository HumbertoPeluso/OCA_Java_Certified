package chapterthree.corejavaapis.understandingjavaarrays;

public class MultidimensionalArrays {
    public static void main(String[]args){

        //Creating a Multidimensional Array

        int[][] vars1; // 2D array
        int vars2 [][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4 [], space [][]; // a 2D AND a 3D array


    //    You can specify the size of your multidimensional array in the declaration if you like:
        String [][] rectangle = new String[3][2];

      //  Now suppose we set one of these values:
        rectangle[0][1] = "set";


       /* While that array happens to be rectangular in shape, an array doesn’t need to be.
        Consider this one:*/
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};


        /*Another way to create an asymmetric array is to initialize just an array’s fi rst dimension,
        and defi ne the size of each array component in a separate statement:*/
        int [][] args2 = new int[4][];
        args2[0] = new int[5];
        args2[1] = new int[3];
        /*This technique reveals what you really get with Java: arrays of arrays that, properly
        managed, offer a multidimensional effect.*/


        //Using a Multidimensional Array
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println(); // time for a new row
        }

    }
}
