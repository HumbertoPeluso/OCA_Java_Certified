package chapterone.javabuildingblocks.creatingobjects;

public class ReadingAndWritingObjectFields {

}

/*It’s possible to read and write instance variables directly from the caller. In this example, a
        mother swan lays eggs:*/

   /* Reading a variable is known as getting it. The class gets numberEggs directly to print it
        out. Writing to a variable is known as setting it. This class sets numberEggs to 1.*/

class Swan {
    int numberEggs;// instance variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // set variable
        System.out.println(mother.numberEggs); // read variable
    }
}

//You can even read and write fi elds directly on the line declaring them:
class Name {
    String first = "Theodore"; // write to fields
    String last = "Moose"; // write to fields
    String full = first + last; //reads the fields first and last then writes to field full
}