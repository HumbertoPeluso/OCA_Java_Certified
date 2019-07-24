package chapterfour.methodsandencapsulation.overloadingmethods;

public class OverloadingAndVarargs {

    public static void main(String[]args){

        fly(new int[] { 1, 2, 3 });
     //   fly(1,2,3); - in the implementation should be varargs

    }

  //  Which method do you think is called if we pass an int[]?
  public static void fly(int[] lengths) { }
//  public void fly(int... lengths) { } // DOES NOT COMPILE - Java treats varargs as if they were an array

}
