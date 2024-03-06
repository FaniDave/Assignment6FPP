package Day6.PersonalExcercise;

//Vehicle class (Parent class)
class Vehicle {
    String name;

    public Vehicle (){}
    public Vehicle (String name) {
         this.name = name;
    }

    public String getName() {
         return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    public void printSomething () {
         System.out.println("Vehicle");
    }
}

public class AnonymousClassFlyOfInheritance {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle() {
             String model;

             public String getModel () {
                  return model;
             }

             public void setModel (String model) {
                  this.model = model;
             }

             @Override
             public void printSomething () {
                  System.out.println("Toyota");
             }
        };

        v1.printSomething();

        Vehicle v2 = new Vehicle("Honda") {
             String model;

             public String getModel () {
                  return model;
             }

             public void setModel (String model) {
                  this.model = model;
             }

             @Override
             public void printSomething() {
                  System.out.println(name);
             }
        };
        v2.printSomething();
    }

}
