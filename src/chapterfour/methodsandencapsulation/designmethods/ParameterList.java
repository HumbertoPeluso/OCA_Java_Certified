package chapterfour.methodsandencapsulation.designmethods;

public class ParameterList {
    public static void main(String[]args){
       /* Although the parameter list is required, it doesn’t have to contain any parameters. This
        means you can just have an empty pair of parentheses after the method name, such as void
        nap(){}. If you do have multiple parameters, you separate them with a comma. There are
        a couple more rules for the parameter list that you’ll see when we cover varargs shortly. For
        now, let’s practice looking at method signatures with “regular” parameters:*/
    }
    public void walk1() { }
 //   public void walk2 { } // DOES NOT COMPILE
    public void walk3(int a) { }
  //  public void walk4(int a; int b) { } // DOES NOT COMPILE
    public void walk5(int a, int b) { }
}
