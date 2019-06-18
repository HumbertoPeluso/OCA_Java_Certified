package chapterthree.corejavaapis.creatingandmanipulatingstrings;

public class Immutability {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);//12
    }
}

class Mutable {
    private String s;

    public void setS(String newS) {
        s = newS;
    } // Setter makes it mutable

    public String getS() {
        return s;
    }
}

final class Immutable {
    private String s = "name";

    public String getS() {
        return s;
    }
}

    /*Immutable only has a getter. There's no way to change the value of s once it's set.
        Mutable has a setter as well. This allows the reference s to change to point to a different
        String later. */