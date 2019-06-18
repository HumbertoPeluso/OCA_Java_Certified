package chapterthree.corejavaapis.creatingandmanipulatingstrings;

public class StringPool {
    public static void main(String[]args){
        String name = "Fluffy";
        name = new String("Fluffy");
    }

    /*Since strings are everywhere in Java, they use up a lot of memory. In some production applications, they can use up 25–40 percent of the memory in the entire program. Java realizes
    that many strings repeat in the program and solves this issue by reusing common ones. The
    string pool, also known as the intern pool, is a location in the Java virtual machine (JVM)
    that collects all these strings.*/
}
