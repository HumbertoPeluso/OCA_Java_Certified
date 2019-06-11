package chapterone.javabuildingblocks.understandingpackagedeclarationsandimports;

/*One of the reasons for using packages is so that class names don’t have to be unique across
        all of Java. This means you’ll sometimes want to import a class that can be found in multiple places. A common example of this is the Date class. Java provides implementations
        of java.util.Date and java.sql.Date. This is another example where you don’t need to
        know the package names for the OCA exam—they will be provided to you. What import
        could we use if we want the java.util.Date version?*/

import java.util.*; // Redundant but compile
import java.sql.*; // not using
// Only the two imports above the code won't compile

import java.util.Date;
// import java.sql.Date; not compile (depends on the order of appereance)

 //Supposing only the next two were present
//import java.util  -- it compiles
//import java.sql.Date; -- won't compile

public class NamingConflicts {
    Date date;
    // some code
}

    /*Sometimes you really do want to use Date from two different packages. When this happens, you can pick one to use in the import and use the other’s fully qualifi ed class name
(the package name, a dot, and the class name) to specify that it’s special.*/

 class Conflicts {
    Date date;
    java.sql.Date sqlDate;
}

   //  Or you could have neither with an import and always use the fully qualifi ed class name:
 class Conflicts2 {
    java.util.Date date;
    java.sql.Date sqlDate;
}
