package chapterfour.methodsandencapsulation.overloadingmethods;

public class OverloadingMethods {

   /* Method overloading occurs when
    there are different method signatures with the same name but different type parameters*/

   // Order Java uses to choose the right overloaded method

    // 1 - Exact match by type
    // 2 - Larger primitive type
    // 3 - Autoboxed type
    // 4 - Varargs

    public static void main(String[]args){

    }

    // These are all valid overloaded methods:

    public void fly(int numMiles) { }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }

   // Now let’s look at an example that is not valid overloading:

    public void fly2(int numMiles) { }
   // public int fly2(int numMiles) { } // DOES NOT COMPILE -  it only differs from the original by return type

 //   What about these two? Why does the second not compile?

    public void fly3(int numMiles) { }
   // public static void fly3(int numMiles) { } // DOES NOT COMPILE - The only difference is that one is an instance
                                               //method and one is a static method

    /*You just write code and Java calls the right one. For
    example, look at these two methods:*/

    public void fly4(int numMiles) {
        System.out.println("short");
    }
    public void fly4(short numFeet) {
        System.out.println("short");
    }

    /*The call fly((short) 1); prints short. It looks for matching types and calls the appropriate method.
            Of course, it
    can be more complicated than this*/




}
