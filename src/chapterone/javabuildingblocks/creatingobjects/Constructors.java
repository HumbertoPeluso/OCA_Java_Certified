package chapterone.javabuildingblocks.creatingobjects;

/*There are two key points to note about the constructor: the name of the constructor
        matches the name of the class, and there’s no return type.*/
public class Constructors {

    public Constructors() {
        System.out.println("in constructor");
    }

    public void Constructors() {
    } // NOT A CONSTRUCTOR

    /*The purpose of a constructor is to initialize fi elds, although you can put any code in
    there. Another way to initialize fi elds is to do so directly on the line on which they’re
    declared.*/

}

class Chicken {
    int numEggs = 0;// initialize on line
    String name;

    public Chicken() {
        name = "Duke";// initialize in constructor
    }
}
