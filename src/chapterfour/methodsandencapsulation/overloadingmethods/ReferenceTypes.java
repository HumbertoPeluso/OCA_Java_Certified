package chapterfour.methodsandencapsulation.overloadingmethods;

public class ReferenceTypes {

   /* Given the rule about Java picking the most specifi c version of a method that it can, what do
    you think this code outputs?*/

    public void fly(String s) {
        System.out.print("string ");
    }

    public void fly(Object o) {
        System.out.print("object ");
    }

    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();

        r.fly("test"); //string
        r.fly(56); //object  -  looks for an int parameter list. When it doesn't fi nd
       // one, it autoboxes to Integer. Since it still doesn't fi nd a match, it goes to the Object one.

    }

}
