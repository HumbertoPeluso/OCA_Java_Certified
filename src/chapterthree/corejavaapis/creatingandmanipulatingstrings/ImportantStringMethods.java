package chapterthree.corejavaapis.creatingandmanipulatingstrings;

public class ImportantStringMethods {
    public static void main(String[] args) {

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


        /*substring()
        The method substring() also looks for characters in a string. It returns parts of the string.
        The fi rst parameter is the index to start with for the returned string. As usual, this is a
        zero-based index. There is an optional second parameter, which is the end index you want
        to stop at.
                Notice we said “stop at” rather than “include.” This means the endIndex parameter is
        allowed to be 1 past the end of the sequence if you want to stop at the end of the sequence.
        That would be redundant, though, since you could omit the second parameter entirely in
        that case. In your own code, you want to avoid this redundancy. Don’t be surprised if the
        exam uses it though. The method signatures are as follows:*/

        // The following code shows how to use substring():

        String string4 = "animals";
        System.out.println(string4.substring(3)); // mals
        System.out.println(string4.substring(string.indexOf('m'))); // mals
        System.out.println(string4.substring(3, 4)); // m  -- prints from index 3 until 4 (but not included)
        System.out.println(string4.substring(3, 7)); // mals -- prints from index 3 until 7 (but not included)

        System.out.println(string4.substring(3, 3)); // empty string --  Since we start and end with the same index, thereare no characters in between
        System.out.println(string4.substring(3, 2)); // throws exception --  never get to index 2 if it starts with index 3.
        System.out.println(string4.substring(3, 8)); // throws exception

        // toLowerCase() and toUpperCase()

        String string5 = "animals";
        System.out.println(string5.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

        /*These methods do what they say. toUpperCase() converts any lowercase characters to
        uppercase in the returned string. toLowerCase() converts any uppercase characters to lowercase in the returned string. These methods leave alone any characters other than letters.
        Also, remember that strings are immutable, so the original string stays the same.*/

        //  equals() and equalsIgnoreCase()

        /*The equals () method checks whether two String objects contain exactly the same characters in the same
        order.The equalsIgnoreCase () method checks whether two String
        objects contain the same characters with the exception that it will convert the characters’
        case if needed.The method signatures are as follows:*/

        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

       // startsWith() and endsWith()

        /*The startsWith() and endsWith() methods look at whether the provided value matches
        part of the String. The method signatures are as follows:*/

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

       // contains()

       /* The contains() method also looks for matches in the String. It isn’t as particular as
        startsWith() and endsWith()—the match can be anywhere in the String. The method
        signature is as follows:*/

        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

      //  replace()

        /*The replace() method does a simple search and replace on the string. There’s a version that takes char parameters as well as a version that takes CharSequence parameters.
                A CharSequence is a general way of representing several classes, including String and
        StringBuilder. It’s called an interface, which we’ll cover in Chapter 5, “Class Design.”
        The method signatures are as follows:*/

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

       // trim()

       /* You’ve made it through the all the String methods you need to know except one. We left
        the easy one for last. The trim() method removes whitespace from the beginning and end
        of a String. In terms of the exam, whitespace consists of spaces along with the \t (tab) and
\n (newline) characters. Other characters, such as \r (carriage return), are also included in
        what gets trimmed. The method signature is as follows:*/

        System.out.println("abc".trim()); // abc
        System.out.println("\t a b c\n".trim()); // a b c
    }
}
