import java.util.List;
import java.util.Arrays;

class Stream
{
    public static void main(String[] args)
    {
        List<Integer> D = Arrays.asList(25, 29, 20, 30, 23);

        System.out.println(D);

        System.out.println(" ");

        int T = 0;

        for(int S : D)
        {
            if(S % 2 == 0)
            {
                S = S * 2;
                T = T + S;
            }
        }

        System.out.print(T);
    }
}