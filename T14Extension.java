class A
{
    public A()
    {
        System.out.println("A as Default");
    }

    public A(int n)
    {
        System.out.println("A as Parameterized");
    }
}

class B extends A
{
    public B()
    {
        System.out.print("B as Default");
    }

    public B(int n)
    {
        super(n);
        System.out.print("B as Parameterized");
    }
}

class Extension
{
    public static void main(String[] args)
    {
        B obj = new B(23);
    }
}