package chapterthree.corejavaapis.understandingarraylist;

public class Wrapperclasses {
    public static void main(String[]argas){

        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        int bad1 = Integer.parseInt("a"); // throws NumberFormatException
        Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException

    }
}
