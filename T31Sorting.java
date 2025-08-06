import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Sorting
{
    public static void main(String[] args)
    {
        List<Integer> D = new ArrayList<Integer>();

        D.add(25);
        D.add(29);
        D.add(20);
        D.add(30);
        D.add(10);
        D.add(10);
        D.add(17);
        D.add(23);

        Collections.sort(D);

        System.out.print(D);
    }
}