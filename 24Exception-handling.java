class exceptionHandling
{
    public static void main(String[] args)
    {
        int i = 3;
        int j = 0;

        int a[] = new int[4];
        a[0] = 25;
        a[1] = 29;
        a[2] = 30;
        a[3] = 23;

        try
        {
            j = 9 / i;

            for(int m = 0; m < 4; m++)
            {
                System.out.println(a[4]);
            }

            System.out.println(" ");
        }
        catch(Exception e)
        {
            System.out.println("Avoid & Go!");

            System.out.println(" ");
        }

        System.out.println(j);

        System.out.println(" ");

        System.out.print("Hi...");
    }
}