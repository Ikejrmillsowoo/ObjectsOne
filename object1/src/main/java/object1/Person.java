package object1;

public class Person {
    String name;
    int age = 0;
    int height = 0; //Height is in centimeters

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("James", 28, 300);
        System.out.println(person1.height + " " + "centimeters");
        /* Now you can use the Object `person1` */

    }
}
