package Day6.PersonalExcercise.StaticNestedClass;

public class StaticNestedClassOuter {

    //Instance fields
    private String s = "Hello";

    //main method
    public static void main(String[] args) {
        new StaticNestedClassOuter();
    }

    //Constructor
    public StaticNestedClassOuter() {
        StaticNestedClass.staticMethod();
        System.out.println(StaticNestedClass.y);

        StaticNestedClass snc = new StaticNestedClass();
        snc.instanceMethod();
        System.out.println(snc.x);
    }

    //StaticNestedClass class
    static class StaticNestedClass {
        //Instance field
        private int x = 9;
        private static int y = 5;

        //Instance method
        public void instanceMethod() {
            System.out.println(x);

            //But no access of the s field from enclosing class
        }

        //Static method
        public static void staticMethod() {
            System.out.println(y);
        }

    }
}


//Another class
class AnotherClass {

    //main method
    public static void main(String[] args) {
        StaticNestedClassOuter.StaticNestedClass snc = new StaticNestedClassOuter.StaticNestedClass();
    }
}