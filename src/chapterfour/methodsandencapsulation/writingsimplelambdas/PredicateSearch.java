package chapterfour.methodsandencapsulation.writingsimplelambdas;

import java.util.ArrayList;
import java.util.List;

public class PredicateSearch {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));

        print(animals, a -> a.canHop());

        //  //////////////////////////

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
        bunnies.removeIf(s -> s.charAt(0) != 'h'); // takes care of everything for us. It defi nes a predicate that takes a String and returns a boolean. The removeIf() method does the rest
        System.out.println(bunnies); // [hoppy]
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
