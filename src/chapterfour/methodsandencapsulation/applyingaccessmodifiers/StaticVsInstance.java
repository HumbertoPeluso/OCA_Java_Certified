package chapterfour.methodsandencapsulation.applyingaccessmodifiers;

public class StaticVsInstance {

   /* There’s another way the exam creators will try to trick you regarding static and instance
members. (Remember that “member” means fi eld or method.) A static member cannot call
    an instance member. This shouldn’t be a surprise since static doesn’t require any instances
    of the class to be around.
    The following is a common mistake for rookie programmers to make:*/

}


class Static {
    private String name = "Static class";
    public static void first() { }
    public static void second() { }
    public  void third() { System.out.println(name); }
    public static void main(String args[]) {
        first();
        second();
        // third(); // DOES NOT COMPILE - reference to a non static method
    } }

   /* Let’s try one more example so you have more practice at recognizing this scenario. Do
            you understand why the following lines fail to compile?*/

class Gorilla{

    public static int count;
    public static void addGorilla(){count++;}
    public void babyGorilla(){count++;}
    public void announceBabies(){
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryOne(){
        addGorilla();
        //  babyGorilla(); // DOES NOT COMPILE
    }

    public  int total;
    //  public static double average = total/count ; // DOES NOT COMPILE - a static variable is trying to use an instance variable.

}

// A common use for static variables is counting the number of instances:

class Counter {
    private static int count;
    public Counter() { count++; }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count); // 3
    }
}