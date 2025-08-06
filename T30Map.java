import java.util.Map;
import java.util.HashMap;

class Hmap
{
    public static void main(String[] args)
    {
        Map<String, Integer> Student = new HashMap<String, Integer>();

        Student.put("Sami", 29);
        Student.put("Ashiq", 32);
        Student.put("Onkon", 33);
        Student.put("Iftekhar", 35);

        System.out.println(Student);
    
        System.out.println(" ");

        System.out.print(Student.get("Iftekhar"));
    }
}