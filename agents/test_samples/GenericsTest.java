Here is the JUnit 5 test class for the Generics class:

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GenericsTest {

    @Test
    public void testGetString() {
        GenericClass<String> stringClass = new GenericClass<>("Hello");
        assertEquals("Hello", stringClass.get());
    }

    @Test
    public void testGetInteger() {
        GenericClass<Integer> intClass = new GenericClass<>(123);
        assertEquals(123, intClass.get().intValue());
    }

    @Test
    public void testGetDouble() {
        GenericClass<Double> doubleClass = new GenericClass<>(12.34);
        assertEquals(12.34, doubleClass.get().doubleValue(), 0.00001);
    }
}

This test class has three test methods: testGetString, testGetInteger, and testGetDouble. Each method tests the get() method of a GenericClass instance with a different type parameter. The test methods use the assertEquals method to check that the returned value is equal to the expected value.

Note that the test class uses the JUnit 5 annotation @Test to indicate that each method is a test method. The test methods are named testGet* to indicate that they test the get() method of the GenericClass class. The test methods also use the assertEquals method to check that the returned value is equal to the expected value.

Also, note that the test class uses the Scanner class to read input from the user, but it does not use the Scanner class in the test methods. Instead, it passes the expected values directly to the test methods using the @Test annotation. This is because the Scanner class is not relevant to the testing of the GenericClass class.