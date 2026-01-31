public class WrapperDemo {
    public static void main(String[] args) {
        int i=5;
        double d=2.5;
        System.out.println("Integer i= "+i);
        System.out.println("Double d= "+d);
        Integer i1= Integer.valueOf(i);
        Double d1= Double.valueOf(d);
        System.out.println("Integer i1: "+i1+ "\t Double d1: "+d1);
        String s1="123";
        String s2= "345";
        System.out.println("Answer is "+(s1+s2));
        /*int str1=Integer.parseInt(s1);
        int str2=Integer.parseInt(s1);
        System.out.println("Answer is : "+(str1+str2));*/

    }
    
}
