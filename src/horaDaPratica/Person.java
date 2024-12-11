package horaDaPratica;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String helloWorld(){
        String message;
        message= """
                \nHello!! My name is %s and I'm %d years old.
                """.formatted(this.name,this.age);
        return message;
    }

    public static void main(String[] args) {
        Person p = new Person("Clark Kent",35);
        System.out.println(p.helloWorld());
    }
}