package hw250521_2;

import java.util.*;

public class two  {
	
    public static void main(String[] args) {
    	
        Set<Person> set = new HashSet<>();
        set.add(new Person("김열공", 20));
        set.add(new Person("최고봉", 56));
        set.add(new Person("우등생", 16));
        set.add(new Person("나자바", 35));
        set.add(new Person("나자바", 35));

        for (Person p : set) {
            System.out.println(p);
        }
    }
}


class Person {
	
    String name;
    int age;

    Person(String name, int age) {
    	
        this.name = name;
        this.age = age;
        
    }

    public String toString() {
    	
        return "Person[" + name + ", " + age + "]";
        
    }

    public boolean equals(Object obj) {
    	
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return this.name.equals(p.name) && this.age == p.age;
        
    }

    public int hashCode() {
    	
        return Objects.hash(name, age);
        
    }
}


