class Strng
{
    public static void main(String[] args)
    {
        String name = new String("Dil");

        // Position-check
        System.out.println(name);
        System.out.println(name.charAt(1));

        System.out.println(" ");

        // Similarity-check
        String S1 = "Monsur";
        String S2 = "Monsur";

        System.out.println(S1 == S2);

        System.out.println(" ");

        // Updating the Buffer-size
        StringBuffer Sb = new StringBuffer();
        System.out.println(Sb.capacity());
        StringBuffer SbU = new StringBuffer("Dil Monsur");
        System.out.println(SbU.capacity());

        System.out.println(" ");

        // Addition
        SbU.append(" Khan");
        System.out.println(SbU);

        // Insertion
        SbU.insert(0, "Md. ");
        System.out.println(SbU);

        // Subtraction
        SbU.delete(10, 12);
        System.out.println(SbU);
    }
}