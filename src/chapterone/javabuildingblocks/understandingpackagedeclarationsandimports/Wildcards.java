package chapterone.javabuildingblocks.understandingpackagedeclarationsandimports;

/*Classes in the same package are often imported together. You can use a shortcut to import
        all the classes in a package:*/
import java.util.*; // imports java.util.Random among other things (imports many unusual classes)
public class Wildcards {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
