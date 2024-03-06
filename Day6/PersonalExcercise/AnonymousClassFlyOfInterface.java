package Day6.PersonalExcercise;

//Interface Vehiclee
interface Vehiclee {

    //Abstract method
    void printSomething();

    //default method
    default void defaultMethod() {
        System.out.println("Default method");
    }

    //Static method
    static void staticMethod() {
        System.out.println("Static method");
    }

    //private method
    private void privateMethod() {
        System.out.println("Private Method");
    }
}

public class AnonymousClassFlyOfInterface {

    //main method
    public static void main(String[] args) {
         Vehiclee v1 = new Vehiclee() {
              String model;

              public String getModel () {
                   return model;
              }

              public void setModel (String model) {
                   this.model = model;
              }

              @Override
              public void printSomething() {
                   System.out.println("Honda");
                   defaultMethod();
                   Vehiclee.staticMethod();
              }
        };

         v1.printSomething();
    }

}
