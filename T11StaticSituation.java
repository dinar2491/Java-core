class Mobile
{
    String brand;
    String model;
    static int price;

    // Method
    public void detail()
    {
        System.out.println(brand + " " + model + " : " + price);
    }
}

class staticSituation
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.model = "(Version - 15)";
        obj1.price = 150;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.model = "(Version - 20)";
        obj2.price = 100;

        Mobile obj3 = new Mobile();
        obj3.brand = "Redmi";
        obj3.model = "(Version - 10)";
        obj3.price = 50;

        Mobile.price = 100;

        obj1.detail();
        obj2.detail();
        obj3.detail();
    }
}