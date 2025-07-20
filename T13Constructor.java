class Human
{
    private String name;
    private int age;

    // Constructor
    public Human()
    {
        name = "Dil";
        age = 26;
    }                                

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Method
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

class Constructor
{
    public static void main(String [] args)
    {
        Human obj1 = new Human();
        System.out.println(obj1.getName() + " " + obj1.getAge());

        Human obj2 = new Human("Miran", 16);
        System.out.print(obj2.getName() + " " + obj2.getAge());
    }
}