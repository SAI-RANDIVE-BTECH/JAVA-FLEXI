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
//what is the advantage of static variable
/*the values stored in the variable getting incremented
the values get replaced

instance variable mai har ek object through call karte uska value unique set hota hai
s1 value 1 and 100
s2 b 100 2
s3 100 3

*/