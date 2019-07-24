package chapterfour.methodsandencapsulation.applyingaccessmodifiers;

public class CallingAStaticVariableOrMethod {

    /*There is one rule that is trickier. You can use an instance
    of the object to call a static method. The compiler checks for the type of the reference and
    uses that instead of the object—which is sneaky of Java. This code is perfectly legal:*/

    public static void main(String[]args){

        Koala k = new Koala();
        System.out.println(k.count);  // 0 -  k is a koala

        k = null;

        System.out.println(k.count);  // 0 -  k is still a koala

       /* Java doesn’t care
        that k happens to be null . Since we are looking for a static, it doesn’t matter.*/


       // One more time because this is really important: what does the following output?

        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count); // 5


    }

}
