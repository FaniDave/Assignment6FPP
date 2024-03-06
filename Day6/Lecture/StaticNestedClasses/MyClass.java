package Day6.Lecture.StaticNestedClasses;

//Outer class (MyClass)
public class MyClass {

        //Instance fields
        private String s = "hello";

        //main method
        public static void main(String[] args) {
            new MyClass();
        }

        //Constructor
         MyClass() {
              StaticNestedClass.myStaticMethod();
              StaticNestedClass snc = new StaticNestedClass();
              System.out.println(snc.x);
              snc.myOtherMethod();
         }

         //StaticNestedClass class
         static class StaticNestedClass {
              //private instance variables
              private int x = 10;

              //static method
              static void myStaticMethod() {
                   //No access of s from outer class because s in instance variable in outer class
                  System.out.println("Static method with in StaticNestedClass");
              }

              //Instance method
              private void myOtherMethod() {
                   System.out.println("Instance method with in static nested class");
              }
         }
}
