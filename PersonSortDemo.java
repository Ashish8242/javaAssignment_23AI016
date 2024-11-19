package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String pname;
    int age;

    public Person(String pname, int age) {
        this.pname = pname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [pname=" + pname + ", age=" + age + "]";
    }
}

class SortPersonName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.pname.compareTo(p2.pname);  // Simplified string comparison
    }
}

class SortPersonAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);  // Simplified age comparison
    }
}

public class PersonSortDemo {
    public static void main(String[] args) {
        // Use generics for the ArrayList
        ArrayList<Person> list = new ArrayList<>();
        
        list.add(new Person("Ankit", 28));
        list.add(new Person("Priyank", 24));
        list.add(new Person("Shaliendra", 23));
        list.add(new Person("Ravi", 31));

        System.out.println("Before Sort:");
        System.out.println(list);

        System.out.println("After sort by name:");
        Collections.sort(list, new SortPersonName());
        System.out.println(list);

        System.out.println("After sort by age:");
        Collections.sort(list, new SortPersonAge());
        System.out.println(list);
    }
}
