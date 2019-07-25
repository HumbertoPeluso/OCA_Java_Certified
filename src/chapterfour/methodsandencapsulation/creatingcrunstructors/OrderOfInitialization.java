package chapterfour.methodsandencapsulation.creatingcrunstructors;

public class OrderOfInitialization {

    /*Now that you’ve learned about static initializers,
    it is time to revisit that. Unfortunately, you do have to memorize this list. We’ll give you lots of
    practice, but you do need to know this order by heart.*/

    /*1. If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For
            now, just say “no superclass” and go on to the next rule.)
    2. Static variable declarations and static initializers in the order they appear in the file.

    3. Instance variable declarations and instance initializers in the order they appear in the file.

    4. The constructor.
    */

}

class InitializationOrderSimple {
    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public InitializationOrderSimple() {
        System.out.println("constructor");
    }

}

class CallInitializationOerderSimple {
    public static void main(String[] args) {
        InitializationOrderSimple init = new InitializationOrderSimple();
    }
   /* 0
      10
      Torchie
      constructor*/
}

// What do you think happens here?

class InitializationOrder {
    private String name = "Torchie";// call forth // after instantiation

    {
        System.out.println(name); // call fifth // show third
    }

    private static int COUNT = 0; // call first  // static is called before instantiation

    static {
        System.out.println(COUNT); // call second - show first count
    }

    {
        COUNT++;
        System.out.println(COUNT); // call sixth // show forth
    }

    public InitializationOrder() {
        System.out.println("constructor"); // call seventh // show fifth
    }

    public static void main(String[] args) {
        System.out.println("read to construct"); // call third - show second ( static out of way)
        new InitializationOrder();
    }
}

//Ready for the tough example? Here it is:

class YetMoreInitializationOrder {
    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    YetMoreInitializationOrder() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new YetMoreInitializationOrder();
    }

    {
        add(8);
    }

    public static void main(String[] args) {
    }

}
