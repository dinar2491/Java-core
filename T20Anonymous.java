class J
{
    public void show()
    {
        System.out.print("J from 'J'");
    }
}

class Anonymous
{
    public static void main(String[] args)
    {
        J obj = new J()
        {
            public void show()
            {
                System.out.print("J from 'Anonymous'");
            }
        };

        obj.show();
    }
}