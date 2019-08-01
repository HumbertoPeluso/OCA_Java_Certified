package chapterfour.methodsandencapsulation.writingsimplelambdas;

import java.util.List;

import static chapterfour.methodsandencapsulation.writingsimplelambdas.LambdaExample.CreateAnimals;

public class LambdaSyntax {
    public static void main(String[]args){

        List<Animal> animals = CreateAnimals();

      //  One of the simplest lambda expressions you can write is the one you just saw:
      print( animals, a -> a.canHop());

        /*The syntax of lambdas is tricky because many parts are optional. These two lines do the
        exact same thing:*/
        print( animals, a -> a.canHop());
        print( animals, (Animal a) -> { return a.canHop(); });

        /*Let’s look at some examples of valid lambdas. Pretend that there are valid interfaces that
        can consume a lambda with zero, one, or two String parameters.*/

        print(() -> true ); // 0 parameters
       print(a -> a.startsWith("test")); // 1 parameter
         print((a, b) -> a.startsWith("test")); // 2 parameters
        print((String a, String b) -> a.startsWith("test")); // 2 parameters


       // print(a, b -> a.startsWith("test")); // DOES NOT COMPILE -  needs parentheses around the parameter list
       // print(a -> { a.startsWith("test"); }); // DOES NOT COMPILE - is missing the return keyword
       // print(a -> { return a.startsWith("test") }); // DOES NOT COMPILE -  is missing the semicolon.

      //  print((a, b) -> { int a = 0; return true;} );// DOES NOT COMPILE
        print((a, b) -> { int c = 0; return true;}); // it uses a different variable name

    }

    private static void print(CheckTraitZeroParameters c) {
    }

    private static void print(CheckTraitOneParameter c) {
    }

    private static void print(CheckTraitTwoParameters c) {
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }


}
