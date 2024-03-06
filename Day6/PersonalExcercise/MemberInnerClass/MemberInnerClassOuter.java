package Day6.PersonalExcercise.MemberInnerClass;

public class MemberInnerClassOuter {

        //Instance field
        private String s = "Hello";

        //main method
        public static void main(String[] args) {
            new MemberInnerClassOuter();
        }

        //Constructor
        public MemberInnerClassOuter (){
            InnerClass innerClass = new InnerClass();
            System.out.println(innerClass.value);
            innerClass.innerMethod();
        }

        //InnerClass
        public class InnerClass {
             public int value = 4;
             private static int x = 5;
             private static void innerMethod () {
//                  System.out.println(s);
                  System.out.println(x);
             }
        }
}
