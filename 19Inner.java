class H
{
    public void show1()
    {
        System.out.println("H");
    }

    static class I
    {
        public void show2()
        {
            System.out.print("I");
        }
    }
}

class Inner
{
    public static void main(String[] args)
    {
        H obj1 = new H();
        obj1.show1();

        H.I obj2 = new H.I();
        obj2.show2();
    }
}