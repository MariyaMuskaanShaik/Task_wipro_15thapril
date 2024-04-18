package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonComparatorLambda {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Charlie", 35));

        // Sort the list by age using a lambda expression
        Collections.sort(persons, Comparator.comparingInt(Person::getAge));

        // Print the sorted list
        System.out.println("Sorted list of persons by age:");
        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
