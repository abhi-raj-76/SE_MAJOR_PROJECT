// Parent class
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("The " + this.name + " says: " + "Roooaaaawwwwww!");
    }
}

// Child class
public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Call the parent constructor
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println("The " + this.name + " says: " + "Woof woof!");
    }
}