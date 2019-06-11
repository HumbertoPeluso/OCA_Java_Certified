package chapterone.javabuildingblocks.understandingdefaultinitializationofvariables;

public class LocalVariables {
    /*Before you can use a variable, it needs a value. Some types of variables get this value
    set automatically, and others require the programmer to specify it. In the following
    sections, we’ll look at the differences between the defaults for local, instance, and
    class variables.*/
    public static void main(String[]args){
        /*A local variable is a variable defi ned within a method. Local variables must be initialized
        before use. They do not have a default value and contain garbage data until initialized. The
        compiler will not let you read an uninitialized value.*/
    }

    public int notValid(){
        int y = 10;
        int x;  // x is declared here

       // int reply = x + y; //does not compile
        // return reply;

        x = 3; // and initialized here
        return x;
    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1; //  only initialized if check happens to be true
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
       // System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }
}
