package chaptersix.exceptions.usingatrystatement.addingafinallyblock;

public class AddingAFinallyBlock {
   /* There are two paths through code with both a catch and a finally. If an exception
    is thrown, the finally block is run after the catch block. If no exception is thrown, the
finally block is run after the try block completes*/
   public static void main(String[]args){

       String s = "";
       try {
           s += "t";
       } catch(Exception e) { // must have a catch or a finally block - always
           s += "c";
       } finally {
           s += "f";
       }
       s += "a";
       System.out.print(s);

   }

   void explore(){
       try{
           seeAnimals();
           fall();
       }catch (Exception e){
           getHugFromDaddy();
       }finally {
           seeMoreAnimals();
       }

       goHome();
   }

    private void seeAnimals() {
    }
    private void fall() {
    }
    private void getHugFromDaddy() {
    }
    private void seeMoreAnimals() {
    }
    private void goHome() {
    }
}
