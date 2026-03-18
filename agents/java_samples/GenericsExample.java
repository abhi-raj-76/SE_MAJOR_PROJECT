public class GenericsExample<T> {
    private T value;

    public GenericsExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

This is a simple Java class that demonstrates the use of generics. The class has a single field of type `T`, which is the generic type parameter. The class also has a constructor and two methods for getting and setting the value of the field.

The constructor takes a single argument of type `T` and assigns it to the `value` field.

The `getValue()` method returns the current value of the `value` field.

The `setValue()` method takes a single argument of type `T` and assigns it to the `value` field.

Note that the class is parameterized with a type parameter `T`, which is the type of the value that will be stored in the `value` field. This allows the class to be used with any type of value, without having to specify the type of the value at compile time.

For example, the following code creates an instance of the `GenericsExample` class with a `String` value:

GenericsExample<String> example = new GenericsExample<String>("Hello, world!");

And the following code creates an instance of the `GenericsExample` class with an `Integer` value:

GenericsExample<Integer> example = new GenericsExample<Integer>(42);

This is just a basic example of generics in Java. Generics can be used in many different ways to create more powerful and flexible code.