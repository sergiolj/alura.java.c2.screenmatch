package horaDaPratica.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Animal implements Comparable<Animal> {
    public String name;
    public String familyName;
    public String raceName;

    public Animal(String familyName, String name, String raceName) {
        this.name = name;
        this.familyName = familyName;
        this.raceName = raceName;
    }

    public String getName() {
        return name;
    }

    public String getRaceName() {
        return raceName;
    }

    @Override
    /** The method compareTo(T o) from interface Comparable, uses a Generic type and needs to be implemented in order
     * to define how the class Animal can be comparable.
     * compareTo() is already implemented in the class String, and therefore you can use it with the field getName()
     * because it's field is a String.
     */
    public int compareTo(Animal animal) {
        return this.getName().compareTo(animal.getName());
    }

    @Override
    public String toString() {
        return "["+name+ " / " + raceName+"]";
    }
}

class Cat extends Animal {
    public Cat(String name, String familyName , String raceName) {
        super(familyName, name, raceName);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("John");
        list.add("Jane");
        list.add("Jack");
        list.add("Bob");
        list.add("Jill");

        System.out.println("\nUsing ArrayList forEach Method");
        list.forEach(System.out::println);

        System.out.println("\nUsing forEach iterator Method");
        for(String names: list){
            System.out.println(names);
        }
        System.out.println("\nUsing iterator for Method");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        Cat cat1 = new Cat("Top Cat", "Felidae", "British Shorthair");
        Cat cat2 = new Cat("Brain", "Felidae", "Bengal cat");
        Cat cat3 = new Cat("Choo Choo", "Felidae", "British Shorthair" );
        Cat cat4 = new Cat("Benny the Ball", "Felidae", "British Shorthair");
        Cat cat5 = new Cat("Fancy Fancy", "Felidae", "Siamese");
        Cat cat6 = new Cat("Spook", "Felidae", "Bengal cat");

        Animal animal1 = new Animal("Bear", "Yogi", "Brown Bear");
        Animal animal2 = new Animal("Bear", "Boo-Boo", "Brown Bear");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(cat4);
        animals.add(cat5);
        animals.add(cat6);
        animals.add(animal1);
        animals.add(animal2);

        System.out.println("List with mixed type of objects");
        for(Animal animal: animals){
            System.out.print(animal.familyName);
            if (animal instanceof Cat cat){
                System.out.println(" "+cat.name);
            }
        }
        Collections.sort(list);
        System.out.println("\nSorted animals"+list);

        Collections.sort(animals);
        System.out.println("\nSorted animals"+animals);

    }
}
