import java.util.List;
import java.util.ArrayList;

class Alist
{
    public static void main(String[] args)
    {
        List<Integer> D = new ArrayList<Integer>();

        D.add(25);
        D.add(29);
        D.add(30);
        D.add(23);

        System.out.println(D.get(2));
        System.out.println(" ");

        System.out.println(D.indexOf(23));
        System.out.println(" ");

        for(int S : D)
        {
            System.out.println(S);
        }
    }
}