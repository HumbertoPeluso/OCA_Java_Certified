package chapterone.javabuildingblocks.understandingjavaclassstructure;

public class FieldsAndMethods {

    //simplest java class
    public class Animal{

    }
    //public - can be sed by other classes
    // class- indicates you are defining a class
    // Animal - name of the class (capital letter)

    public class Animal_{
        String name;

        public String getName(){
            return name;
        }

        public void setName(String newName){
            name = newName;
        }
    }

}
