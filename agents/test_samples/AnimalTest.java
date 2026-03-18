import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class AnimalTest {
    @Test
    public void testEat() {
        Animal animal = new Animal("", 0);
        animal.eat();
        assertEquals("Eating...", animal.getOutput());
    }

    @Test
    public void testSleep() {
        Animal animal = new Animal("", 0);
        animal.sleep();
        assertEquals("Sleeping...", animal.getOutput());
    }

    @Test
    public void testBark() {
        Dog dog = new Dog("", 0);
        dog.bark();
        assertEquals("Woof!", dog.getOutput());
    }
}