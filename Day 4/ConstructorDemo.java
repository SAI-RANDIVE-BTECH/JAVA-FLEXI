public class ConstructorDemo {
    public static void main(String[] args) {
        new Demo();
    
    }
    
}
class Demo{
    Demo()
    {
        this("Default Constructor");
    }

Demo(String msg){
    System.out.println(msg);
}
}
