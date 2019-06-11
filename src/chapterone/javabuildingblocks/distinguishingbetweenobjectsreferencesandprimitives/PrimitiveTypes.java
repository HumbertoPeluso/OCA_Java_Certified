package chapterone.javabuildingblocks.distinguishingbetweenobjectsreferencesandprimitives;

public class PrimitiveTypes {

    boolean primitiveBoolean = true; // true or false

    byte primitiveByte = 123; // 8-bit integral value

    short primitiveShort = 123; // 16-bit integral value

    int primitiveInt = 123; // 32-bit integral value

    long primitiveLong = 123; // 64-bit integral value

    float primitiveFloat = 123.45f; // 32-bit floating-point value

    double primitiveDouble = 123.456; // 64-bit floating-point value

    char primitiveChar = 'a'; // 16-bit Unicode value

    // long max = 3123456789; // DOES NOT COMPILE

    long max = 3123456789L; // now Java knows it is a long

    int thisIsOctal = 017; //(digits 0-7)

    int thisisHexaDecimal = 0xff; //(digits 0-9)

    int thisIsBinary = 0b10; // (digits 0-1)

    /*You
    can have underscores in numbers to make them easier to read:*/
    int million1 = 1000000;
    int million2 = 1_000_000;

    /*We’d rather be reading the latter one because the zeroes don’t run together. You can add
    underscores anywhere except at the beginning of a literal, the end of a literal, right before a
    decimal point, or right after a decimal point.*/
    // double notAtStart = _1000.00; // DOES NOT COMPILE
    //  double notAtEnd = 1000.00_; // DOES NOT COMPILE
    //  double notByDecimal = 1000_.00; // DOES NOT COMPILE
    double annoyingButLegal = 1_00_0.0_0; // this one compiles

    public static void main(String[] args) {
        System.out.println(56); // 56
        System.out.println(0b11); // 3
        System.out.println(017); // 15
        System.out.println(0x1F); // 31
    }

}
