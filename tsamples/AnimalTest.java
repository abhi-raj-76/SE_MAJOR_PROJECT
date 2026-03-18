import org.junit.jupiter.api.Test;
 
 class AnimalTest {
     @Test
     void speak() {
         // Test the speak method of the parent class
         Animal animal = new Animal("John", 30);
         assertEquals("The John says: Roooaaaawwwwww!", animal.speak());
     }
     
     @Test
     void speakDog() {
         // Test the speak method of the child class
         Dog dog = new Dog("Max", 2, "Golden Retriever");
         assertEquals("The Max says: Woof woof!", dog.speak());
     }
 }