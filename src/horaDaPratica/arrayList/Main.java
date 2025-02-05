package horaDaPratica.arrayList;

import java.util.ArrayList;

class Animal{
    public String familyName;

    public Animal(String familyName) {
        this.familyName = familyName;
    }
}

class Cat extends Animal{
    public String species;
    public String name;

    public Cat(String name, String familyName) {
        super(familyName);
        this.name = name;
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

        Cat miau = new Cat("miau", "Felidae");
        Cat mimi = new Cat("mimi", "Felidae");
        Cat purr = new Cat("purr", "Felidae");

        Animal animal1 = new Animal("Bear");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(miau);
        animals.add(mimi);
        animals.add(purr);
        animals.add(animal1);

        System.out.println("List with mixed type of objects");
        for(Animal animal: animals){
            System.out.print(animal.familyName);
            if (animal instanceof Cat cat){
                System.out.println(" "+cat.name);
            }
        }
    }
}
