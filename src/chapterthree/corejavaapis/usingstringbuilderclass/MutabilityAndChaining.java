package chapterthree.corejavaapis.usingstringbuilderclass;

public class MutabilityAndChaining {

    public static void main(String[]args){
        /*When we chained String method calls, the
        result was a new String with the answer. Chaining StringBuilder objects doesn’t work
        this way. Instead, the StringBuilder changes its own state and returns a reference to itself!
                Let’s look at an example to make this clearer:*/

         StringBuilder sb = new StringBuilder("start");
         sb.append("+middle"); // sb = "start+middle"
         StringBuilder same = sb.append("+end"); // "start+middle+end" -- which means sb and same point to the exact same object and would print
        //out the same value

       // What do you think this example prints?

         StringBuilder a = new StringBuilder("abc");
         StringBuilder b = a.append("de");
         b = b.append("f").append("g");
         System.out.println("a=" + a); // abcdefg
         System.out.println("b=" + b);// abcdefg

    }


}
