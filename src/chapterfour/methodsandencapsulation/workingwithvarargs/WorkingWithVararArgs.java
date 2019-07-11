package chapterfour.methodsandencapsulation.workingwithvarargs;

public class WorkingWithVararArgs {
    public static void main(String[] args) {
       /*
       As you saw in the previous chapter, a method may use a vararg parameter (variable argument) as if it is an array. It is a little different than an array, though. A vararg parameter
        must be the last element in a method’s parameter list. This implies you are only allowed to
        have one vararg parameter per method.
        */

        walk(1); // 0
        walk(1, 2); // 1
        walk(1, 2, 3); // 2
        walk(1, new int[]{4, 5}); // 2

    }

    public void walk1(int... nums) {
    }

    public void walk2(int start, int... nums) {
    }
    //   public void walk3(int... nums, int start) { } // DOES NOT COMPILE
    //  public void walk4(int... start, int... nums) { } // DOES NOT COMPILE

    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }
}
