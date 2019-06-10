package chapterone.javabuildingblocks.understandingpackagedeclarationsandimports;

import java.util.*; // imports java.util.Random among other things
public class Wildcards {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
