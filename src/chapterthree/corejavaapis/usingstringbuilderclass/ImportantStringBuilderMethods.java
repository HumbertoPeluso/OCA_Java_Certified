package chapterthree.corejavaapis.usingstringbuilderclass;

public class ImportantStringBuilderMethods {

    public static void main(String[]args){

        // charAt(), indexOf(), length(), and substring()
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch); // anim 7 s

      //  append()
       /* The append() method is by far the most frequently used method in StringBuilder. In fact,
        it is so frequently used that we just started using it without comment. Luckily, this method
        does just what it sounds like: it adds the parameter to the StringBuilder and returns a reference to the current StringBuilder. One of the method signatures is as follows:*/

        StringBuilder sb2 = new StringBuilder().append(1).append('c');
        sb2.append("-").append(true);
        System.out.println(sb2); // 1c-true

       // insert()

        /*The insert() method adds characters to the StringBuilder at the requested index and
        returns a reference to the current StringBuilder. Just like append(), there are lots of
        method signatures for different types. Here’s one:*/

        StringBuilder sb3 = new StringBuilder("animals");
        sb3.insert(7,"-"); // sb = animals-
        sb3.insert(0,"-"); // sb = -animals-
        sb3.insert(4,"-"); // -ani-mails-
        System.out.println(sb3);

       // delete() and deleteCharAt()
        /*The delete() method is the opposite of the insert() method. It removes characters from
        the sequence and returns a reference to the current StringBuilder. The deleteCharAt()
        method is convenient when you want to delete only one character. The method signatures
        are as follows:*/

        StringBuilder sb4 = new StringBuilder("abcdef");
        sb4.delete(1, 3); // sb = adef
       // sb4.deleteCharAt(5); // throws an exception

      //  reverse()
        /*After all that, it’s time for a nice, easy method. The reverse() method does just what it
        sounds like: it reverses the characters in the sequences and returns a reference to the current
        StringBuilder. The method signature is as follows:*/

        StringBuilder sb5 = new StringBuilder("ABC");
        sb5.reverse();
        System.out.println(sb5);// CBA




    }
}
