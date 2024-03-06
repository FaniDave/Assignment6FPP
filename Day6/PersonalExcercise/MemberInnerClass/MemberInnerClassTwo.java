package Day6.PersonalExcercise.MemberInnerClass;

public class MemberInnerClassTwo {

         //Fields
           private InnerClass innerClass;

           //Method
            private InnerClass getMyInnerClass() {
                 this.innerClass = innerClass;
                 return innerClass;
            }


        //Inner class
        class InnerClass {
            private int innerInt = 9;
            private static int z  = 0;
            InnerClass(int innerInt) {
                 this.innerInt = innerInt;
            }
        }


        //main method
        public static void main(String[] args) {
            System.out.println(new MemberInnerClassTwo().getMyInnerClass().innerInt);
        }

}
