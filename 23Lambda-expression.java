interface O
{
    // void show(int a, int b);

    float add(int c, int d);
}

class lambdaExpression
{
    public static void main(String[] args)
    {
        /*
        O obj1 = (int a, int b) -> System.out.print(a + " : " + b);

        obj1.show(25, 29);
        */
       
        O obj2 = (int c, int d) ->
        {
            float r = c + d;            
            return r;
        };

        float r = obj2.add(25, 29);

        System.out.print(r);
    }
}