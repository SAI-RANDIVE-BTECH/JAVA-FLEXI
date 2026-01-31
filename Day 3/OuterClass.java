// Q4. Java program using the concept of Outer class and Inner class

import java.util.Scanner;

public class OuterClass {
    int num;

    class InnerClass {
        void show() {
            System.out.println("Number entered: " + num);
        }
    }

    public static void main(String[] args) {
        System.out.println("SAI RANDIVE 25070122509");
        Scanner sc = new Scanner(System.in);
        OuterClass outer = new OuterClass();
        System.out.print("Enter a number: ");
        outer.num = sc.nextInt();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.show();
    }
}
