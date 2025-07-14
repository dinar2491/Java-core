class Calculator
{
    public float add(int n1, int n2)
    {
        float r = n1 + n2;
        return r;
    }
}

class classObject
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();

        float r = obj.add(2, 3);

        System.out.print(r);
    }
}