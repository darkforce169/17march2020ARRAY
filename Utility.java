
import java.util.Scanner;
public class Utility
{
    public static void splitinto2(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Input the unique and non-negative elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            if(a[i] < 0)
            {
                System.out.println("Element is negative.");
                break;
            }            
        }
        int largest = a[0];
        int secondlargest = a[0];
        for (int i = 0; i < n; i++)
        {
            if (a[i] > largest)
            {
		secondlargest = largest;
		largest = a[i];
	
            }
            else if (a[i] > secondlargest)
            {
		secondlargest = a[i];
 
            }
	}
        // i cannot 
    }
    public static void shiftelement(int rot)
    {
       int m;
       Scanner b = new Scanner(System.in);
       System.out.print("Enter number of elements in the array: ");
       m = b.nextInt();
       int a[] = new int[m];
       System.out.println("Input the  elements of the array: ");
       for(int i = 0; i < m; i++)
       {
           a[i] = b.nextInt();
       }
       for(int i = 0; i < rot; i++)
       {
           int last = a[m-1]; //stores last elemten in array
           for(int j = m-1; j > 0; j--)
           {
               a[j] = a[j-1]; //shift element 
           }
           a[0] = last; // store last element in array to the start of array
       }
       for(int i = 0; i < m; i++)
       {
           System.out.print(a[i] + " ");
       }
       System.out.println();
    }
    
    public static void symmetric(int mat[][])
    {
        int yaya = 0;
        for(int i = 0; i < 3; i++)
        {
            
            for(int j = 0; j < 3; j++)
            {
                if(mat[i][j] != mat[j][i])
                {
                    System.out.println("Not symmetric");
                    return;
                }
                else
                {
                    yaya += 1;
                }
            }
            
        }
        if(yaya >= 9)
        {
            System.out.println("ITS Symmetric");
        }
    }
    public static void magicsquare(int sizeofsquare)
    {
       createsquare(sizeofsquare);
       
    }
    public static void createsquare(int n)
    {
        int[][] arr = new int[n][n];
        int i = n/2; /*  row position of number 1 */
        int j = n-1; // ccolumn position for num 1
        for(int num = 1; num <= n*n;)
        {
            if(i == -1 && j == n)
            {
                j = n-2;
                i = 0;
            }
            else
            {
                if(j == n)
                    j = 0;
                if(i < 0)
                    i = n-1;
            }
            if(arr[i][j] != 0)  
            { 
                j -= 2; 
                i++; 
                continue; 
            } 
            else                 
            {   
                arr[i][j] = num++;  
                j++;
                i--;
            }
        }
        for(i=0; i<n; i++) 
        { 
            for(j=0; j<n; j++)
            {
                System.out.print(arr[i][j]+" "); 
            }   
            System.out.println(); 
       
        } 
        
    }
    
}