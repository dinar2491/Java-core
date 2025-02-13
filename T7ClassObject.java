class Calculator
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

class classObject
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();

        int r = obj.add(1, 7);

        System.out.print(r);
    }
}