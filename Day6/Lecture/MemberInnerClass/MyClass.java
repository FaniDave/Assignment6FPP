package Day6.Lecture.MemberInnerClass;

public class MyClass {

          //Instance fields
          private String s = "Hello";

          //main method
          public static void main(String[] args) {
              new MyClass();
          }

          //Constructor
          MyClass() {
                MyInnerClass myInner = new MyInnerClass();
                System.out.println(myInner.intVal);
                myInner.innerMethod();
          }

          //Inner Class
          private class MyInnerClass {
               //Instance field
               private int intVal = 3;
               private void innerMethod() {
                    System.out.println(s);
               }
          }
}
