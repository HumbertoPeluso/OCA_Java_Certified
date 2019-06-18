package chapterthree.corejavaapis.creatingandmanipulatingstrings;

public class Concatenation {

    public static void main(String[]args){
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);//64

         String s = "1"; // s currently holds "1"
         s += "2"; // s currently holds "12"
         s += 3; // s currently holds "123"
         System.out.println(s); // 123
    }
}
