package chapterfour.methodsandencapsulation.applyingaccessmodifiers;

// import static java.util.Arrays; // DOES NOT COMPILE - static imports are only for importing static member

import static java.util.Arrays.asList;

// static import java.util.Arrays.*; // DOES NOT COMPILE - order of keywords

//STATIC IMPORTS
public class BadStaticImports {

    public static void main(String[] args) {
      //  Arrays.asList("one"); // DOES NOT COMPILE -  no Arrays
    }

}
