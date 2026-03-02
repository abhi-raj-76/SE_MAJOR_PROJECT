```
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("The " + name + " says: " + getSound());
    }

    protected String getSound() {
        return "Unknown sound";
    }
}

public class Dog extends Animal {
    @Override
    protected String getSound() {
        return "Woof!";
    }
}

public class Cat extends Animal {
    @Override
    protected String getSound() {
        return "Meow!";
    }
}
```