// Q3. Java program implementing instance variable, instance method and static method using user input

import java.util.Scanner;

public class StudentDemo {
    String name;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public static void college() {
        System.out.println("College: ABC Engineering College");
    }

    public static void main(String[] args) {
        System.out.println("SAI RANDIVE 25070122509");
        Scanner sc = new Scanner(System.in);
        StudentDemo s = new StudentDemo();
        System.out.print("Enter student name: ");
        s.name = sc.nextLine();
        s.displayName();
        StudentDemo.college();
    }
}
