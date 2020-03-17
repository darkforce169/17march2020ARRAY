

public class driver
{
    public static void main(String[] args)
    {
        Utility.shiftelement(2);
        int mat[][] = { { 1, 3, 5 }, 
                    { 3, 2, 4 }, 
                    { 5, 4, 1 } };
        System.out.println("\n");
        Utility.symmetric(mat);
        System.out.println("\n");
        Utility.magicsquare(3); 
    }
}
