import java.util.Scanner;

public class ArrayBasics
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
    
            int arr[] = new int[n];
            for(int i=0 ; i<arr.length ; i++)     System.out.print(arr[i]+ " ");
            
            for(int i=0 ; i<arr.length ; i++)   arr[i] = sc.nextInt();
            System.out.println();
            for(int i=0 ; i<arr.length ; i++)   System.out.print(arr[i]+ " ");
            sc.close();
        }
    }
}