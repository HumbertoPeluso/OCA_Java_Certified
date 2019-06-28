package chapterthree.corejavaapis.understandingequality;

public class UnderstandingEquality {

    public static void main(String[]args){
        /*In Chapter 2, you learned how to use == to compare numbers and that object references
        refer to the same object.*/

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true -- because StringBuilder is mutable

        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true

       /* Remember that Strings are immutable and literals are pooled. The JVM created only
        one literal in memory. x and y both point to the same location in memory; therefore, the
        statement outputs true. It gets even trickier.*/

        String x2 = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x2 == z); // false

        /*In this example, we don’t have two of the same String literal. Although x and z happen to evaluate to the same string, one is computed at runtime. Since it isn’t the same at
        compile-time, a new String object is created.*/

        String x3 = new String("Hello World");
        String y3 = "Hello World";
        System.out.println(x3 == y3); // false
        /*Since you have specifi cally requested a different String object, the pooled value isn’t
                shared*/


        String x4 = "Hello World";
        String z4 = " Hello World".trim();
        System.out.println(x4.equals(z4)); // true
        /*This works because the authors of the String class implemented a standard method
                called equals to check the values inside the String rather than the String itself. If a
        class doesn’t have an equals method, Java determines whether the references point to the
        same object—which is exactly what == does. In case you are wondering, the authors of
        StringBuilder did not implement equals(). If you call equals() on two StringBuilder
        instances, it will check reference equality*/

        Tiger t1 = new Tiger();
         Tiger t2 = new Tiger();
         Tiger t3 = t1;
         System.out.println(t1 == t1); // true  because we are comparing references to the same object
         System.out.println(t1 == t2); // false  because the two object references are different
         System.out.println(t1.equals(t2)); // false  since Tiger does not implement equals(). Don’t worry—you aren’t expected to know how to implement equals() for the OCA exam.


    }

    public static class Tiger{
        String name;
    }

}
