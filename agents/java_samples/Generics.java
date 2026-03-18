public class Generics {
    public static void main(String[] args) {
        // Example usage of generics
        GenericClass<String> stringClass = new GenericClass<>("Hello");
        GenericClass<Integer> intClass = new GenericClass<>(123);
        GenericClass<Double> doubleClass = new GenericClass<>(12.34);

        System.out.println(stringClass.get()); // Output: Hello
        System.out.println(intClass.get()); // Output: 123
        System.out.println(doubleClass.get()); // Output: 12.34
    }
}

class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T get() {
        return data;
    }
}