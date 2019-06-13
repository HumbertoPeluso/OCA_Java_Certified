package chaptertwo.operatorsandstatements.understandjavastatements;

public class ForEachStatement {

    public static void main(String[]args){

        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names) {
            System.out.print(name + ", "); //Lisa, Kevin, Roger,
        }


        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(String value : values) {
            System.out.print(value + ", "); //Lisa, Kevin, Roger,
        }

       /* String names2 = "Lisa";
        for(String name : names2) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }*/

       /* String[] names3 = new String[3];
        for(int name : names3) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }*/

    }

}
