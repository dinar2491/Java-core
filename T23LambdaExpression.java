interface O
{
    //void show(int i, int j);

    float add(int a, int b);
}

class lambdaExpression
{
    public static void main(String[] args)
    {
        /*
        O obj1 = (int i, int j) -> System.out.print(i + " : " + j);

        obj1.show(25, 29);
        */
       
        O obj2 = (int a, int b) ->
        {
            float r = a + b;            
            return r;
        };

        float r = obj2.add(25, 29);

        System.out.print(r);
    }
}