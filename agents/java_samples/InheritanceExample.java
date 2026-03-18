class Animal {
  String name;
  int age;

  Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void eat() {
    System.out.println(name + " is eating");
  }
}

class Dog extends Animal {
  Dog(String name, int age) {
    super(name, age);
  }

  void bark() {
    System.out.println(name + " is barking");
  }
}

class Cat extends Animal {
  Cat(String name, int age) {
    super(name, age);
  }

  void meow() {
    System.out.println(name + " is meowing");
  }
}

public class InheritanceExample {
  public static void main(String[] args) {
    Animal animal = new Dog("Buddy", 3);
    animal.eat();

    Dog dog = new Dog("Max", 5);
    dog.bark();

    Cat cat = new Cat("Whiskers", 2);
    cat.meow();
  }
}

This is a simple example of object-oriented programming (OOP) inheritance in Java. The `Animal` class is the superclass, and the `Dog` and `Cat` classes are subclasses that inherit from `Animal`. The `Animal` class has a few instance variables and methods, while the `Dog` and `Cat` classes have additional methods that are specific to each class. The `main` method creates an instance of the `Animal` class and calls its `eat` method, which prints out a message to the console. It then creates an instance of the `Dog` class and calls its `bark` method, which prints out a message to the console. Similarly, it creates an instance of the `Cat` class and calls its `meow` method, which prints out a message to the console.