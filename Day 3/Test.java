class Test
{
    void modifyValue(int x)
    {
        x+=10;
    }
    public static void main(String[] args) {
        int a = 5;
        Test t = new Test();
        t.modifyValue(a);
        System.out.println(a);
    }
}