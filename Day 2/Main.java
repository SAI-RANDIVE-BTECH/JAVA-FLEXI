class Constructor { // Removed 'public' here
    String name;
    int age;

    // This is the Default Constructor
    Constructor() {
        name = "Default Name";
        age = 18;
    }

    void display() {
        // Added spaces and a comma for better readability
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

public class Main 
{
        public static void main(String[] args) 
    {
        
        Constructor cs = new Constructor();
        cs.display();
        System.out.println("SAI RANDIVE 25070122509");
    }
}