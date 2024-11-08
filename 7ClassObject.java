class Calculator
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

class ClassObject
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();

        int r = obj.add(2, 0);

        System.out.print(r);
    }
}