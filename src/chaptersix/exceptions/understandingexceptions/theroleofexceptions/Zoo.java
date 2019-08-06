package chaptersix.exceptions.understandingexceptions.theroleofexceptions;

public class Zoo {
    public static void main(String[]args){
        System.out.println(args[0]);
        System.out.println(args[1]);

       /* $ javac Zoo.java
        $ java Zoo Zoo*/

        /*ZooException in thread "main"
        java.lang.ArrayIndexOutOfBoundsException: 1
        at mainmethod.Zoo.main(Zoo.java:7)*/

    }
}
