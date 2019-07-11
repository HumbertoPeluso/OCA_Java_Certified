package chapterfour.methodsandencapsulation.designmethods;

public class ReturnType {
    public static void main(String[]args){
        /*The next item in a method declaration is the return type. The return type might be an
        actual Java type such as String or int. If there is no return type, the void keyword is used.
        This special return type comes from the English language: void means without contents. In
        Java, we have no type there.*/
    }

    public void walk1() { }
    public void walk2() { return; }
    public String walk3() { return ""; }
 //   public String walk4() { } // DOES NOT COMPILE
 //   public walk5() { } // DOES NOT COMPILE
   // String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE


}
