package chapterone.javabuildingblocks.creatingobjects;

/*When writing code that initializes fi elds in multiple places, you have to keep track of the
        order of initialization. We’ll add some more rules to the order of initialization in Chapters 4
        and 5. In the meantime, you need to remember:
        ■ Fields and instance initializer blocks are run in the order in which they appear in
        the file.
        ■ The constructor runs after all fields and instance initializer blocks have run.*/
public class OrderOfInitialization {

}

class Chick {
    private String name = "Fluffy"; // 3 - initializes name

    {
        System.out.println("setting field"); // 4 - executes print statement
    }

    public Chick() {
        name = "Tiny"; // 5 - change the name value
        System.out.println("setting constructor"); // 6 - print other statement
    }

    public static void main(String[] args) { // 1 - starts with main method
        Chick chick = new Chick(); // 2 - call the constructor of Chick
        System.out.println(chick.name); // 7 - print last statement

        /*Order matters for the fi elds and blocks of code. You can’t refer to a variable before it has
        been initialized:*/
      //  { System.out.println(name); } // DOES NOT COMPILE
      //  private String name = "Fluffy";

    }
}
