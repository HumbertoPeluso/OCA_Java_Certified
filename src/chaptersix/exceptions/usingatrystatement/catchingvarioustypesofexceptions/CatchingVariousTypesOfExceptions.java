package chaptersix.exceptions.usingatrystatement.catchingvarioustypesofexceptions;

public class CatchingVariousTypesOfExceptions {
    public static void main(String[]args){

    }
    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {// first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// second catch block
            System.out.print("not today");
        }
    }


  //  The following example shows exception types that do inherit from each other:

    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) {// subclass exception - Change Order doesnt compile
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// superclass exception
            System.out.print("not today");
        }
    }


    private void seeAnimal() {
    }
}


class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }
