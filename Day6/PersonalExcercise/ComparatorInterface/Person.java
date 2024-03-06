package Day6.PersonalExcercise.ComparatorInterface;

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
}

//NameComparator class
class NameComparator implements Comparator<Person> {

       @Override
       public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
       }
}

//AgeComparator class
class AgeComparator implements Comparator<Person> {

    @Override
     public int compare(Person p1, Person p2) {
         return Integer.compare(p1.getAge(), p2.getAge());
    }
}

//TestPerson class
class TestPerson {

       //main method
       public static void main(String[] args) {
           Person[] people = new Person[] {
                    new Person("Faniel", 26),
                    new Person("Sirak", 23),
                     new Person("Asmina", 20)
           };

           System.out.println("People before sorting :");
           for(Person p : people) {
               System.out.println( p.getName() + ", " + p.getAge());
           }

           System.out.println("*".repeat(50));

           System.out.println("People after sorting by name :");
           Arrays.sort(people, new NameComparator());
           for(Person p : people) {
               System.out.println(p.getName() + ", " + p.getAge());
           }

           System.out.println("*".repeat(50));

           System.out.println("People after sorting by age:");
           Arrays.sort(people, new AgeComparator());
           for(Person p : people) {
               System.out.println(p.getName() + ", " + p.getAge());
           }

           System.out.println("*".repeat(50));
       }
}