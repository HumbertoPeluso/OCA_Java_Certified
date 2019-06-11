package chapterone.javabuildingblocks.creatingobjects;

/*When you learned about methods, you saw braces ({}). The code between the braces is
        called a code block. Sometimes this code is called being inside the braces. Anywhere you
        see braces is a code block.*/

public class InstanceInitializerBlocks {

   /* Sometimes code blocks are inside a method. These are run when the method is called.
    Other times, code blocks appear outside a method. These are called instance initializers.*/

    public static void main(String[] args) {
        {
            System.out.println("Feathers");
        }
    }

    {
        System.out.println("Snowy");
    }

   /* There are three code blocks and one instance initializer. Counting code blocks is easy:
    you just count the number of pairs of braces. If there aren’t the same number of open ({)
        and close (}) braces, the code doesn’t compile. It doesn’t matter that one set of braces is
    inside the main() method—it still counts.*/

}
