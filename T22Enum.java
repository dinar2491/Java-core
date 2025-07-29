enum Status
{
    Failed(0), Pending(1), Running(2), Success(3),

    Apple(1), Samsung(1), Redmi(2), Oppo(3), Vivo(3);

    private int level;

    private Status(int level)
    {
        this.level = level;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }
}

class Enum
{
    public static void main(String[] args)
    {
        Status S = Status.Pending;

        // Position & Status
        System.out.println(S.ordinal());
        System.out.println(S);

        System.out.println(" ");

        // Catalogue-Status-Comment
        Status[] A = Status.values();

        for(int i = 0; i < 4; i++)
        {
            System.out.println(A[i].ordinal() + " : " + A[i]);
        }

        Status D = Status.Success;

        if(D == Status.Failed)
        {
            System.out.println("Failed || Try-again!");
        }
        else if(D == Status.Pending)
        {
            System.out.println("Pending || Wait...");
        }
        else if(D == Status.Running)
        {
            System.out.println("Running || Close...");
        }
        else
        {
            System.out.println("Success || Congratulations!");
        }

        switch(D)
        {
            case Failed:
                System.out.println("Failed || Try-again!");
                break;
            case Pending:
                System.out.println("Pending || Wait...");
                break;
            case Running:
                System.out.println("Running || Close...");
                break;
            case Success:
                System.out.println("Success || Congratulations!");
                break;
        }

        System.out.println(" ");

        // Extra : Brand & Level
        Status L = Status.Redmi;

        System.out.print(L + " : " + L.getLevel());
    }
}