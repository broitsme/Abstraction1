package OopsConcepts.Abstraction1;

abstract public class Animal {
    public abstract void makeSound();
    public void eat(){
        System.out.println("Eating from plate!");
    }
    public void sleep(){
        System.out.println("Zzzz");
    }
}

class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("meow.");
    }
}
