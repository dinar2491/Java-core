import java.lang.Thread;

class Counter
{
    int count;

    public synchronized void increament()
    {
        count++;
    }
}

class raceCondition
{
    public static void main(String[] agrs) throws InterruptedException
    {
        Counter C = new Counter();

        Runnable d1 = new Runnable()
        {
            public void run()
            {
                for(int i = 1; i < 10001; i++)
                {
                    C.increament();
                }
            }
        };

        Runnable d2 = new Runnable()
        {
            public void run()
            {
                for(int i = 1; i < 10001; i++)
                {
                    C.increament();
                }
            }
        };

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.print(C.count);
    }
}