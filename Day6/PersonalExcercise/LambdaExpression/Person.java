package Day6.PersonalExcercise.LambdaExpression;

import java.util.Arrays;

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
           Person[] people = new Person[] {
                    new Person("Faniel", 21),
                    new Person ("Asmina", 24),
                    new Person ("Sirak", 23),
                    new Person("Diana", 22)
           };

           System.out.println("Before Sorting : ");
           for(Person p : people) {
                System.out.println(p.getName() + ", " + p.getAge());
           }

           System.out.println("*".repeat(50));

           System.out.println("After Sorting By name: ");
//           Comparator<Person> nameComparator = new Comparator<Person> () {
//                @Override
//                public int compare (Person p1, Person p2) {
//                     return p1.getName().compareTo(p2.getName());
//                }
//           };
           Arrays.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
           for(Person p : people) {
               System.out.println(p.getName() + ", " + p.getAge());
           }

           System.out.println("*".repeat(50));

           System.out.println("After Sorting By Age: ");
//           Comparator<Person> ageComparator = new Comparator<Person> () {
//                 @Override
//                 public int compare (Person p1, Person p2) {
//                     return Integer.compare(p1.getAge(), p2.getAge());
//                 }
//
//           };
           Arrays.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
           for(Person p : people) {
               System.out.println(p.getName() + ", " + p.getAge());
           }

       }
}
