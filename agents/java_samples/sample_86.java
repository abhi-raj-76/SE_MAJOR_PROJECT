// Parent class
class Animal {
  public void speak() {
    System.out.println("The animal makes a sound.");
  }
}

// Child class
class Dog extends Animal {
  public void speak() {
    System.out.println("Woof!");
  }
}

// Main method
class Main {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.speak(); // Output: Woof!
  }
}

Note: This is a simple example of inheritance in Java. In a real-world scenario, you would have multiple classes inheriting from the same parent class and potentially overriding the methods inherited from the parent class with their own implementation.