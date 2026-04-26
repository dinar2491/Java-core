class conditionalOperation
{
    public static void main(String[] args)
    {
        int a = 10, c = 17;

        // if - else
        if(a < c)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(c);
        }

        int b = 10;

        // if - else if
        if(a > b || a < c)
        {
            System.out.println(a);
        }
        else if(a < b && a > c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }

        int n = 7;

        // switch-case
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

        // Extra: Checking as Odd / Even
        if(c % 2 != 0)
        {
            result = "Odd-number";
        }
        else
        {
            result = "Even-number";
        }

        System.out.print(result);
    }
}