import java.util.Scanner;

class Student1 {
    String name;
    int rollNo;
    char division;

    // Parameterized constructor
    Student1(String name, int rollNo, char division) {
        this.name = name;
        this.rollNo = rollNo;
        this.division = division;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Division: " + division);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter division: ");
        char division = sc.next().charAt(0);
        Student1 s1 = new Student1(name, rollNo, division);

        System.out.println("\nStudent Details:");
        s1.display();

        sc.close();
    }
}
 
