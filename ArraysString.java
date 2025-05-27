import java.util.Scanner;

public class ArraysString
{
    public static void main(String ars[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        System.out.println(arr[4]);

        for(int i=0 ; i<arr.length ; i++)   System.out.print(arr[i]+ " ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        
        for(int i=0 ; i<str.length ; i++)   str[i] = sc.next();
        System.out.println();
        for(int i=0 ; i<str.length ; i++)   System.out.print(str[i]+ " ");

        System.out.println();
        float arr2[] = new float[n];
        for(int i=0 ; i<arr2.length ; i++)  System.out.print(arr2[i]+ " ");

        System.out.println();
        double arr3[] = new double[n];
        for(int i=0; i<arr3.length ; i++)   System.out.print(arr3[i]+ " ");

        for(int i=0 ; i<arr2.length ; i++)  arr2[i] = sc.nextFloat();
        for(int i=0 ; i<arr3.length ; i++)  arr3[i] = sc.nextDouble();
        System.out.println();
        for(int i=0 ; i<arr2.length ; i++)  System.out.print(arr2[i]+ " ");
        System.out.println();
        for(int i=0 ; i<arr3.length ; i++)  System.out.print(arr3[i]+ " ");
        
    }
}