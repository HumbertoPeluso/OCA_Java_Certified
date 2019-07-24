package chapterfour.methodsandencapsulation.applyingaccessmodifiers;

public class DesigningStaticMethodsAndFields {

    /*Except for the main() method, we’ve been looking at instance methods. Static methods
    don’t require an instance of the class. They are shared among all users of the class. You can
    think of statics as being a member of the single class object that exist independently of any
            instances of that class*/

}

 class Koala {
    public static int count = 0; // static variable
    public static void main(String[] args) {  // static method
        System.out.println(count);
    }
}

 class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]);  // call static method
    }
}
