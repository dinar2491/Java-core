class conditionalOperation
{
    public static void main(String[] args)
    {
        int x = 30, y = 10;

        //if - else
        if(x > y)
        {
            System.out.println(x);
        }
        else
        {
            System.out.println(y);
        }

        int z = 23;

        //if - else if
        if(x > y || x < z)
        {
            System.out.println(x);
        }
        else if(y > x && y < z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }

        int n = 5;

        //switch-case
        switch(n)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

        String result;

        //Extra : Checking as Odd / Even
        if(y % 2 == 0)
        {
            result = "Even-number";
        }
        else
        {
            result = "Odd-number";
        }

        System.out.print(result);
    }
}