package Day6.PersonalExcercise.ComparatorInterfaceLocalInnerClass;


import java.util.Arrays;
import java.util.Comparator;

//Person class (Outer class)
public class Person {

    //Instance fields
    private String name;
    private int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {}

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Instance method
     public void sortByName(Person[] people) {
          //LocalInner class
          class NameComparator implements Comparator<Person> {
               @Override
               public int compare (Person p1, Person p2) {
                    return p1.getName().compareTo(p2.getName());
               }
          }
          Arrays.sort(people, new NameComparator());
     }
     public void sortByAge(Person[] people) {
         //LocalInner class
         class AgeComparator implements Comparator<Person> {
               @Override
               public int compare (Person p1, Person p2) {
                    return Integer.compare(p1.getAge(), p2.getAge());
               }
         }
         Arrays.sort(people, new AgeComparator());
     }
}

//Test class
class Test {

       //main method
       public static void main(String[] args) {
           Person[] people = new Person[] {
                    new Person("Faniel", 26),
                    new Person("Asmina", 20),
                    new Person ("Sirak", 23)
           };

           for(Person p : people) {
                System.out.println(p.getName() + ", " + p.getAge());
           }

           System.out.println("*".repeat(50));

           new Person().sortByAge(people);
           for(Person p : people) {
               System.out.println(p.getName() + ", " + p.getAge());
           }

           System.out.println("*".repeat(50));

           new Person().sortByName(people);
           for(Person p : people) {
               System.out.println(p.getName() + ", " + p.getAge());
           }
       }
}