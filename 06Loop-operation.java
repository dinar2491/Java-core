class loopOperation
{
    public static void main(String[] args)
    {
        int a = 1;

        // while
        while(a <= 2)
        {
            System.out.println("Hi, friend - " + a + "!");
            a++;

            int b = 1;

            while(b <= 3)
            {
                System.out.println("Hello, junior - " + b + ".");
                b++;
            }
        }

        System.out.println(" ");

        int c = 3;

        // do - while
        do
        {
            System.out.println("Hi, friend - " + c + "!");
            c++;
        }
        while(c >= 15);

        System.out.println(" ");

        // for
        for(int i = 1; i < 6; i++)
        {
            System.out.println("Day - " + i);

            for(int j = 9; j < 17; j++)
            {
                System.out.println("   " + j + ":00 - " + (j + 1) + ":00");
            }
        }
    }
}