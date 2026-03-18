// Parent class
public class Animal {
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Child class
public class Dog extends Animal {
    // Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    // Method override
    public void bark() {
        System.out.println("Woof!");
    }
}

// Main method
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog dog = new Dog("Buddy", 3);

        // Call the eat() method
        dog.eat();

        // Call the sleep() method
        dog.sleep();

        // Call the bark() method
        dog.bark();
    }
}


This code defines a `Dog` class that extends the `Animal` class. The `Dog` class has its own constructor and methods, but it also inherits the `Animal` class's instance variables and methods. The `Main` class is used to test the `Dog` class and demonstrate how it can be used.