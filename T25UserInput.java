import java.util.Scanner;

class userInput
{
    public static void main(String[] args)
    {
        System.out.print("Enter a Number: ");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(" ");

        System.out.print(n);
    }
}