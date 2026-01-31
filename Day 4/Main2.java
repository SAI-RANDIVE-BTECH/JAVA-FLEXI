public class Main2 {
    public static void main(String[] args) {
        new Child();
    }
    
}
class Parent{

    public Parent() {
        System.out.println("Parent class constructor");
    }
    
}
class Child extends Parent{

    public Child() {
        super();
        System.out.println("Child class constructor");
    }
    
}