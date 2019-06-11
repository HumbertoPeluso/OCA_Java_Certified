package chapterone.javabuildingblocks.understandingvariablesscope;

public class VariableScope {

    public static void main(String[]args){

    }

    // There are two local variables in this method. bitesOfCheese is declared inside the
    //method. piecesOfCheese is called a method parameter.
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    //Local variables can never have a scope larger than the method they are defi ned in
    public void eatIfHungry(boolean hungry){
        if(hungry){
            int bitesOfCheese = 1;
        }// bitesOfCheese goes out of scope here
       // System.out.println(bitesOfCheese);// DOES NOT COMPILE
    }
}
