import java.util.Scanner;

public class Sum
{
    public static int[] sumReturn(int nums[])
    {
        for(int i=0 ; i<nums.length ; i++)   nums[i] /= 10;
        int r[] = new int[5];
        for(int i=0 ; i<r.length ; i++)
        {
            r[i] = nums[i];
            r[i] *= 9;
        }
        return r;
    }






    // p s int -------> var. ne return karshe
    // p s int[] -----------> int type na array ne return karshe and definition ma to symbol aavshe [] pan maro bhai bhale te return kare to pan tya only return r; j lakahavanu raheshe.
    // var. ni jem j return a; or return r;
    // aane jovathi no kahabr pade ke shu return thay chhe arr ke var.
    // pan aani definition ma p s pachi if, jo int---------> var. return
    // int[]-----------> arr return thay chhe
    // return and call bane ma arr. and var. bane na only name j aavshe
    





    public static float sum(int nums[])
    {
        float a = 5.0F;
        for(int i=0 ; i<nums.length ; i++)  nums[i] += 10000;
        return a;
    }







    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<arr.length ; i++)   System.out.print(arr[i]+ " ");
        System.out.println();
        for(int i=0 ; i<arr.length ; i++)   arr[i] = sc.nextInt();
        for(int i=0 ; i<arr.length ; i++)   System.out.print(arr[i]+ " ");
        System.out.println();

        float f = sum(arr); // calling ma pan only name jjjjj 

        System.out.println(f);
        for(int i=0 ; i<arr.length ; i++)   System.out.print(arr[i]+ " ");
        
        
        
        
        
        



        
        System.out.println("\n\nnew sumReturn\n\n");
        System.out.println("before the calling of sumReturn funcation" );
        for(int i=0 ; i<arr.length ; i++)   System.out.print(arr[i]+ " ");
        System.out.println();
        int rprint[]; // only the declaration of the array
        rprint = sumReturn(arr);
        System.out.println("after the calling and returning the values of arr has been successfully changed through the pass by reference " );
        for(int i=0 ; i<arr.length ; i++)   System.out.print(arr[i]+ " ");
        System.out.println("\nthe newly DECLARED ONLY , aanu creation running time per thay chhe function calling pachi " );
        for(int i=0 ; i<arr.length ; i++)   System.out.print(rprint[i]+ " ");


        //only and only jyare create kravata hoy array ne main() ma or function ni definition ma ,    ---->  aa both jagayaye j maro bhai arrayNaName ni baju ma [] symbol aavshe baki kyay aatle kyay j nahi aave ee game te no hoy pan nahi aave 
    }
}