import java.util.Scanner;

class calculator
{
     public static void main(String[] args) {
        calculator c= new calculator();
        c.IntAddition();
        c.Floating();
        c.ThreeIntegers();              
    }
    Scanner sc=new Scanner(System.in);
    void IntAddition(){
        int a, b;
        System.out.println("Enter  2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.err.println("Addition = "+(a+b));
    }
    void Floating()
    {
        float a,b;
        System.out.println("Enter floating numbers");
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.err.println("Addition = "+(a+b));

    }
    void ThreeIntegers()
    {
        int a,b,c;
        System.out.println("Enter  3 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.err.println("Addition = "+(a+b+c));
        
    }
   
}