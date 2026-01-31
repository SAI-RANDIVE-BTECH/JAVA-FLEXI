// Q1. Write a program using Wrapper Class where we take float input and print it as int

import java.util.Scanner;

public class WrapperFloatToInt {
    public static void main(String[] args) {
        System.out.println("SAI RANDIVE 25070122509");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        float num = sc.nextFloat();
        Float obj = new Float(num);
        int intValue = obj.intValue();
        System.out.println("Integer value: " + intValue);
    }
}
