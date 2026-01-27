class CounterExample 
{
    
    static int count = 0; 

    
    CounterExample() {
        count++;
        System.out.println("Object Created. Current Count is: " + count);
    }
}

public class Counter 
{ 
    public static void main(String[] args)
     {
        
        CounterExample obj1 = new CounterExample();
        CounterExample obj2 = new CounterExample();
        CounterExample obj3 = new CounterExample();

        
        System.out.println("Final Count: " + CounterExample.count);
        System.out.println("SAI RANDIVE 25070122509");
    }
}