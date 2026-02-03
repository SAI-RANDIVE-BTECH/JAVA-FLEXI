import java.util.Scanner;

class Numbers {
    int a, b, c;
    float x, y;
}

public class calci_with_method_overload {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calci_with_method_overload c = new calci_with_method_overload();
        Numbers n = new Numbers();
        c.addition(n); 
        c.additionFloat(n); 
        c.additionThree(n); 
    }

    void addition(Numbers n) {
        System.out.println("Enter 2 integers");
        n.a = sc.nextInt();
        n.b = sc.nextInt();
        System.out.println("Addition = " + (n.a + n.b));
    }

    void additionFloat(Numbers n) {
        System.out.println("Enter 2 floating numbers");
        n.x = sc.nextFloat();
        n.y = sc.nextFloat();
        System.out.println("Addition = " + (n.x + n.y));
    }

    void additionThree(Numbers n) {
        System.out.println("Enter 3 integers");
        n.a = sc.nextInt();
        n.b = sc.nextInt();
        n.c = sc.nextInt();
        System.out.println("Addition = " + (n.a + n.b + n.c));
    }
}