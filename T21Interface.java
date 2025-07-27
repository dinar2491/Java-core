interface K
{
    String brand = "Redmi";
    int price = 20000;

    void captureImage();
    void captureVideo();
}

interface L
{
    void showDimension();
}

interface M extends L
{

} 

class N implements K, M
{
    public void showDimension()
    {
        System.out.println("5.5");
    }

    public void captureImage()
    {
        System.out.println("Stored in Gallery");
    }

    public void captureVideo()
    {
        System.out.print("Stored in Drive");
    }
}

class Interface
{
    public static void main(String[] args)
    {
        K obj1 = new N();
        M obj2 = new N();

        System.out.println(K.brand);
        System.out.println(K.price);

        obj2.showDimension();
        obj1.captureImage();
        obj1.captureVideo();
    }
}