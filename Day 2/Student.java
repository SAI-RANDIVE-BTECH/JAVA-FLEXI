public class Student 
{
    int id;
    String name;
    public static void main(String[] args) 
    {
        Student s1= new Student();
        Student s2= new Student();
        Student s3= new Student();
        Student s4= new Student();
        s1.id=100;
        s1.name="Sai";
        System.out.println(s1.id+" "+s1.name);
        s2.id=101;
        s2.name="Santosh";
        System.out.println(s2.id+" "+s2.name);
        s3.id=103;
        s3.name="Sanika";
        System.out.println(s3.id+" "+s3.name);
        s4.id=104;
        s4.name="Soham";
        System.out.println(s4.id+" "+s4.name);        
    }
}
