public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        // Call the parent class method using super
        super.eat();
        System.out.println("Dog eats bones");
    }


    void bark() {
        System.out.println("Dog barks");
    }
}