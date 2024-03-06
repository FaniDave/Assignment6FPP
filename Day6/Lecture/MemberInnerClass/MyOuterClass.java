package Day6.Lecture.MemberInnerClass;

public class MyOuterClass {

    //Inner Class
    private String param;
    MyInnerClass inner;

    //Constructor
    MyOuterClass(String param) {
        this.param = param;
        inner = new MyInnerClass("InnerStr");
    }

    //Instance method
    void outerMethod() {
        System.out.println(inner.innerParam);
        inner.innerMethod();
        //String t = inner.this.innerParam; //Compiler Error
    }

    //Member inner class
    class MyInnerClass {
        //Fields
        private String innerParam;

        //Constructor
        MyInnerClass(String innerParam) {
            this.innerParam = innerParam;
        }

        //Inner method
        void innerMethod() {
            System.out.println(MyOuterClass.this.param); //accessing param using this which is a version of Enclosing class
            System.out.println(param);
        }

    }

    public static void main(String[] args) {
        new MyOuterClass("OuterStr").outerMethod();
    }

}
