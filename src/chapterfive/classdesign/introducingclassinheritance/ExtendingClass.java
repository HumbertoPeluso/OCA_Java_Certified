package chapterfive.classdesign.introducingclassinheritance;

public class ExtendingClass {
    /*In Java, you can extend a class by adding the parent class name in the defi nition using the
            extends keyword*/

    class Animal {
        private int age;
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }

    class Lion extends Animal {
        private void roar() {
            System.out.println("The "+getAge()+" year old lion says: Roar!");

          //  System.out.println("The "+age+" year old lion says: Roar!");
            // DOES NOT COMPILE - age has private access

        }
    }


}
