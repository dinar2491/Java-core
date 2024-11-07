class LoopOperation
{
    public static void main(String[] args)
    {
        //while
        int i = 1;

        while(i <= 2)
        {
            System.out.println("Hi, friend - " + i + "!");
            i++;

            int j = 1;

            while(j <= 5)
            {
                System.out.println("Hello, junior - " + j + "!");
                j++;
            }
        }

        System.out.println(" ");

        //do-while
        int m = 10;

        do
        {
            System.out.println("Hi, friend - " + m + "!");
            m++;
        }
        
        while(m >= 29);

        System.out.println(" ");

        //for
        for(int p = 1; p < 6; p++)
        {
            System.out.println("Day - " + p);

            for(int q = 9; q < 17; q++)
            {
                System.out.println("   " + q + ":00 - " + (q + 1) + ":00");
            }
        }
    }
}