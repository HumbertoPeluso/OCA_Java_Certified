package chapterthree.corejavaapis.creatingandmanipulatingstrings;

public class ImportantStringMethods {
    public static void main(String[]args){

        /*length()
        The method length() returns the number of characters in the String. The method signature is as follows:*/
        String string = "animals";
        System.out.println(string.length()); // 7

        System.out.println("................");

        /*charAt()
        The method charAt() lets you query the string to fi nd out what character is at a specifi c
        index. The method signature is as follows:*/

        String string2 = "animals";
        System.out.println(string2.charAt(0)); // a
        System.out.println(string2.charAt(6)); // s
      //  System.out.println(string2.charAt(7)); // throws exception
        System.out.println("................");

       /* indexOf()
        The method indexOf()looks at the characters in the string and fi nds the fi rst index that
        matches the desired value. indexOf can work with an individual character or a whole String
        as input. It can also start from a requested position. The method signatures are as follows:*/
        String string3 = "animals";
        System.out.println(string3.indexOf('a')); // 0
        System.out.println(string3.indexOf("al")); // 4
        System.out.println(string3.indexOf('a', 4)); // 4
        System.out.println(string3.indexOf("al", 5)); // -1
        System.out.println("................");
    }
}
