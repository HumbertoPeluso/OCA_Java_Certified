package chapterthree.corejavaapis.usingstringbuilderclass;

public class CreatingStringBuilder {
    public static void main(String[]args){
        // There are three ways to construct a StringBuilder:

        StringBuilder sb1 = new StringBuilder(); //  create a StringBuilder containing an empty sequence of characters and assign sb1 to point to it
        StringBuilder sb2 = new StringBuilder("animal"); //  create a StringBuilder containing a specifi c value and assign sb2 to point to it
        StringBuilder sb3 = new StringBuilder(10); //  tells Java that we have some idea of how big the eventual value
                                                           //will be and would like the StringBuilder to reserve a certain number of slots for characters.

        // For the fi rst two, it tells Java to manage the implementation details.


    }

}
