class Student
{
    int roll;
    String name;
    int mark;
}

class Array
{
    public static void main(String[] args)
    {
        //Single
        int arrS[] = new int[4];
        arrS[0] = 25;
        arrS[1] = 29;
        arrS[2] = 30;
        arrS[3] = 23;

        for(int i = 0; i < 4; i++)
        {
            System.out.println(arrS[i]);
        }

        System.out.println(" ");

        //Multi
        int arrM[][] = new int[3][4];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                arrM[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(arrM[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        //jagged
        int arrJ[][] = new int[3][];
        arrJ[0] = new int[4];
        arrJ[1] = new int[5];
        arrJ[2] = new int[6];

        for(int i = 0; i < arrJ.length; i++)
        {
            for(int j = 0; j < arrJ[i].length; j++)
            {
                arrJ[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < arrJ.length; i++)
        {
            for(int j = 0; j < arrJ[i].length; j++)
            {
                System.out.print(arrJ[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        
        //Extra : Roll-Name-Mark
        Student S1 = new Student();
        S1.roll = 29;
        S1.name = "Sheikh";
        S1.mark = 84;

        Student S2 = new Student();
        S2.roll = 33;
        S2.name = "Onkon";
        S2.mark = 92;

        Student S3 = new Student();
        S3.roll = 35;
        S3.name = "Iftekhar";
        S3.mark = 87;

        Student StudentS[] = new Student[3];
        StudentS[0] = S1;
        StudentS[1] = S2;
        StudentS[2] = S3;

        for(int i = 0; i < StudentS.length; i++)
        {
            System.out.println(StudentS[i].roll + " " + StudentS[i].name + " : " + StudentS[i].mark);
        }

        System.out.println(" ");

        for(Student S : StudentS)
        {
            System.out.println(S.roll + " " + S.name + " : " + S.mark);
        } 
    }
}