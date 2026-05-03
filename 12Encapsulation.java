class Human
{
    private String name;
    private int age;

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

class Encapsulation
{
    public static void main(String[] args)
    {
        Human obj = new Human();

        obj.setName("Dil");
        obj.setAge(28);

        System.out.print(obj.getName() + " " + obj.getAge());
    }
}