package chaptersix.exceptions.callingmethodsthatthrowsexceptions;

public class NoMoreCarrotsException extends Exception {

    public static class Bunny {
        public static void main(String[] args) throws NoMoreCarrotsException {
            // eatCarrot();// DOES NOT

            eatCarrot();

            ///////

           /* public static void main(String[] args) { -- also works
                try {
                    eatCarrot();
                } catch (NoMoreCarrotsException e ) {// handle exception
                    System.out.print("sad rabbit");
                }
            }*/

        }

        private static void eatCarrot() throws NoMoreCarrotsException {
        }

        public void bad() {
            try {
                eatCarrot();
            } catch (NoMoreCarrotsException e ) {// DOES NOT COMPILE
                System.out.print("sad rabbit");
            }
        }

        public void good() throws NoMoreCarrotsException {
            eatCarrot();
        }

    }

}
