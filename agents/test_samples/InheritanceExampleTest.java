import java.util.Scanner;

public class InheritanceExampleTest {
    @Test
    void testInheritance() {
        Animal animal = new Dog("Buddy", 3);
        animal.eat();

        Dog dog = new Dog("Max", 5);
        dog.bark();

        Cat cat = new Cat("Whiskers", 2);
        cat.meow();
    }
}