import java.util.Set;
import java.util.HashSet;

class Hset
{
    public static void main(String[] args)
    {
        Set<Integer> D = new HashSet<Integer>();

        D.add(25);
        D.add(29);
        D.add(20);
        D.add(30);
        D.add(10);
        D.add(10);
        D.add(17);
        D.add(23);

        for(int S : D)
        {
            System.out.println(S);
        }
    }
}