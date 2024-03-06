package Day6.PersonalExcercise.ComparatorInterfaceMemberInnerClass;

import java.util.Arrays;
import java.util.Comparator;

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

    //NameComparator (Member Inner class)
    private class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    //AgeComparator (Member Inner class)
    private class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }

    //Special Getters
    public NameComparator getNameComparator() {
        return new NameComparator();
    }

    public AgeComparator getAgeComparator() {
        return new AgeComparator();
    }
}

//PersonTest
class PersonTest {

       //main method
       public static void main(String[] args) {
           Person[] people = new Person[] {
                   new Person ("Faniel", 26),
                   new Person ("Sirak", 23),
                   new Person ("Asmina", 20)
           };

           //Default sort
           for(Person p : people) {
               System.out.println(p.getName() + ", " + p.getAge());
           }

           System.out.println("*".repeat(50));

           //Sort by Age
           sortByAge(people);

           System.out.println("*".repeat(50));

           //Sort by Name
           sortByName(people);

       }

       //sortByAge method
       public static void sortByAge(Person[] people) {
           Arrays.sort(people, new Person().getAgeComparator());
            for(Person p : people) {
                 System.out.println(p.getName() + ", " + p.getAge());
            }
       }

       //sortByName method
       public static void sortByName (Person[] people) {
            Arrays.sort(people, new Person().getNameComparator());
           for(Person p : people) {
               System.out.println(p.getName() + ", " + p.getAge());
           }
       }
}
