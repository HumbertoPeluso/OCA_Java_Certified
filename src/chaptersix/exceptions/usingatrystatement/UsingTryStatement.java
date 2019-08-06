package chaptersix.exceptions.usingatrystatement;

public class UsingTryStatement {
    public static void main(String[]args){

    }

    void explore(){
        try{
            fall();
            System.out.println("never get here");
        }catch (RuntimeException e){
            getUp();
        }
        seeAnimals();
    }

    private void getUp() {
    }

    void fall(){
        throw new RuntimeException();
    }
    private void seeAnimals() {
    }
}
