package Day6.PersonalExcercise.MemberInnerClass;

public class MemberInnerClassOuterOne {

        //main method
        public static void main(String[] args) {
            new MemberInnerClassOuterOne("OuterStr").outerMethod();
        }

         //Instance fields
         private String s;
         InnerClass innerClass;

         //Constructor
         public MemberInnerClassOuterOne (String s) {
                this.s = s;
                innerClass = new InnerClass("InnerStr");
         }

         //Instance method
         public void outerMethod() {
//System.out.println(InnerClass.this.innerParam);Trying to use this outside of inner class (compiler error)
             System.out.println(innerClass.innerParam);
             innerClass.innerMethod();
         }

         //Inner Class
         private class InnerClass {
             //Fields
               private String innerParam;

               //Constructor
               public InnerClass(String innerParam) {
                    this.innerParam = innerParam;  //Inner class version of this
               }

               //Instance method
                private void innerMethod() {
                    System.out.println(MemberInnerClassOuterOne.this.s); //Outer class version of this
                    System.out.println(s); //the same with the above
                }
         }
}
