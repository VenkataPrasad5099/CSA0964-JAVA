// Interface
interface Animal {
    // Interface method (does not have a body)
    void makeSound();

    // Default method
    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Dog class implements the Animal interface
class Dog implements Animal {
    // The body of makeSound() is provided here
    public void makeSound() {
        System.out.println("The dog says: woof woof");
    }
}

// Cat class implements the Animal interface
class Cat implements Animal {
    // The body of makeSound() is provided here
    public void makeSound() {
        System.out.println("The cat says: meow meow");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        myDog.makeSound();
        myDog.sleep();

        Cat myCat = new Cat(); // Create a Cat object
        myCat.makeSound();
        myCat.sleep();
    }
}
