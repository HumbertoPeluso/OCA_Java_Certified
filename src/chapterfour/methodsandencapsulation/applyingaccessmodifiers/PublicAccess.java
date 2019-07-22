package chapterfour.methodsandencapsulation.applyingaccessmodifiers;

public class PublicAccess {

   // public means anyone can access the member from anywhere.


    /*
    Can access              if that member is private           If that member has default           if that member is protected       if that member is public
                                                                (package private) access?

   Member in the
   same class                     yes                                     yes                                   yes                            yes

   Member in another
   class in same
   package                        No                                      yes                                    yes                             yes

   Member in a
   superclass in a
   different package              No                                      No                                      yes                             yes

   Method/field in a
   non-superclass class in
   a different package            NO                                      No                                      No                               yes

    * */

}
