package Day6.PersonalExcercise.LocalInnerClass;


//Outer class
public class ClassA {

      //Instance field with in Outer class
      private int x = 10;

      //Instance method
      void myMethod(int y) {
             int z = 10;
            //LocalInner Class
            class LocalInner {
                int a = 10;

                //Instance method
                void print () {
                     System.out.println(x + y + z + a);
                }
            }
            new LocalInner().print();
      }
}

//Test
class Test {

    //main method
    public static void main(String[] args) {
        new ClassA().myMethod(10);
    }
}
