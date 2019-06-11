package chapterone.javabuildingblocks.understandingpackagedeclarationsandimports;

/*Wait a minute! We’ve been referring to System without an import and Java found it just
        fi ne. There’s one special package in the Java world called java.lang. This package is
        special in that it is automatically imported. You can still type this package in an import
        statement, but you don’t have to. In the following code, how many of the imports do you
        think are redundant?*/
import java.lang.System; // Redundant:  everything in java.lang is automatically considered to be imported
import java.lang.*; // Redundant too
import java.util.Random; //If this line wasn’t present, java.util.* wouldn’t be redundant
import java.util.*; //redundant:  Random is already imported from java.util.Random

// InputImports
import java.nio.file.*; // reduntant (but compiles perfectly)
import java.nio.file.Files;
import java.nio.file.Paths;

import java.nio.*; // NO GOOD – a wildcard only matches
                    //class names, not "file.*Files"

//import java.nio.*.*; // NO GOOD – you can only have one wildcard
                        //and it must be at the end

// import java.nio.files.Paths.*; // NO GOOD – you cannot import methods
                                    //only class names

public class RedundantImports {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }

}

/*Another case of redundancy involves importing a class that is in the same package as the
class importing it. Java automatically looks in the current package for other classes.
        Let’s take a look at one more example to make sure you understand the edge cases for
        imports.*/

 class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}
