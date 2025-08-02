import java.lang.Thread;

class P extends Thread
{
    public void run()
    {
        for(int i = 1; i < 6; i++)
        {
            System.out.println("Hi...");
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class Q extends Thread
{
    public void run()
    {
        for(int i = 1; i < 6; i++)
        {
            System.out.println("Hello!");
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class Thrd
{
    public static void main(String[] args)
    {
        P obj1 = new P();
        Q obj2 = new Q();
        
        obj1.start();
        obj2.start();
    }
}