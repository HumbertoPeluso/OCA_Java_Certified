package chapterfour.methodsandencapsulation.designmethods;

public class MethodBody {

   /*
   Element                       Value in nap() example                           Required?

   Access modifier                        public                                     No
   Optional specifier                     final                                      No

   Return type                            void                                       Yes

   Method name                            nap                                        Yes
   Parameter list                        (int minutes)                               Yes, but can be empty parentheses

   Optional exception list               throws InterruptedException                 No

   Method body                            {
                                             // take a nap
                                           }                                         Yes, but can be empty braces

    */

   public static void main(String[]args){
       /*The fi nal part of a method declaration is the method body (except for abstract methods and
       interfaces, but you don’t need to know about either of those until next chapter). A method
       body is simply a code block. It has braces that contain zero or more Java statements. We’ve
       spent several chapters looking at Java statements by now, so you should fi nd it easy to fi gure
       out why these compile or don’t:*/
   }

    public void walk1() { }
   // public void walk2; // DOES NOT COMPILE
    public void walk3(int a) { int name = 5; }
}
