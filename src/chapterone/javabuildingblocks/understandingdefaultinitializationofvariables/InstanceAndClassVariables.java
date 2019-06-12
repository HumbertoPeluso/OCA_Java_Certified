package chapterone.javabuildingblocks.understandingdefaultinitializationofvariables;

public class InstanceAndClassVariables {
    /*Variables that are not local variables are known as instance variables or class variables.
    Instance variables are also called fi elds. Class variables are shared across multiple objects.
    Instance and class variables do not require you to initialize them. As soon as you declare
    these variables, they are given a default value.*/
    public static void main(String[] args) {

        boolean defaultBoolean; //false

        byte defaultByte; //0 (in the type’s bit-length)
        short defaultShort; // 0 (in the type’s bit-length)
        int defaultInt; //0 (in the type’s bit-length)
        long defaultLong; // 0 (in the type’s bit-length)

        float defaultFloat; //0.0 (in the type’s bit-length)
        double defaultDouble; //0.0 (in the type’s bit-length)

        //All object references (everything else) null

    }
}

