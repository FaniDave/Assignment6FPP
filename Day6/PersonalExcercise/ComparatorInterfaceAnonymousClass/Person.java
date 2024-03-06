package Day6.PersonalExcercise.ComparatorInterfaceAnonymousClass;

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

//Test class
class Test {

    //main method
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Faniel", 26),
                new Person("Asmina", 20),
                new Person("Luwam", 24),
                new Person("Sirak", 23)
        };

        System.out.println("Before Sorting: ");
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getAge());
        }

        System.out.println("*".repeat(50));

        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };

        Arrays.sort(people, nameComparator);
        System.out.println("After Sorting by name: ");
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getAge());
        }

        System.out.println("*".repeat(50));

        Comparator<Person> ageComparator = new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        Arrays.sort(people, nameComparator);
        Arrays.sort(people, nameComparator);
        System.out.println("After Sorting by age: ");
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getAge());
        }

        System.out.println("*".repeat(50));
    }
}