// Q2. Java program implementing static method and instance method using user input

import java.util.Scanner;

public class StaticInstanceDemo {
    public int square(int n) {
        return n * n;
    }

    public static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        System.out.println("SAI RANDIVE 25070122509");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        StaticInstanceDemo obj = new StaticInstanceDemo();
        System.out.println("Square (Instance Method): " + obj.square(num));
        System.out.println("Cube (Static Method): " + StaticInstanceDemo.cube(num));
    }
}
