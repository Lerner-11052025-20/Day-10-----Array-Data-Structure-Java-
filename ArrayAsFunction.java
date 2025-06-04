public class ArrayAsFunction 
{
    public static void reference(int nums[], int x1, int x2 , int x3)
    {
        nums[0] = 200;
        nums[1] = 2200;
        nums[2] = 222200;
        nums[3] = 2222200;
        nums[4] = -423423;

        x1 = 500000;
        x2 = 106000;
        x3 = 40000;
    }
    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        for(int i=0 ; i<arr.length ; i++)   System.out.print(arr[i]+ " ");
        
        int a = 5, b=10 , c=20;
        System.out.println("\n" +a+ " " +b+ " " +c);


        reference(arr, a, b, c);
        for(int i=0 ; i<arr.length ; i++)   System.out.print(arr[i]+ " ");
        System.out.println("\n" +a+ " " +b+ " " +c);
    }    
}
