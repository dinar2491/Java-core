abstract class Mobile
{
    public abstract void captureImage();

    public void captureVideo()
    {
        System.out.print("Stored in Drive");
    }
}

class Tab extends Mobile
{
    public void captureImage()
    {
        System.out.println("Stored in Gallery");
    }
}

class Abstract
{
    public static void main(String[] args)
    {
        Mobile obj = new Tab();

        obj.captureImage();
        obj.captureVideo();
    }
}