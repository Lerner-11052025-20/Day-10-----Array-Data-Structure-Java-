public class Pairs 
{
    public static void pairsMOREMORE__OPTIMIZRD(int nums[])
    {
        int tp=0;
        for(int i=0 ; i<nums.length-1 ; i++)
        {
            for(int j=i+1 ; j<nums.length ; j++)
            {
                tp++;
                System.out.print("(" +nums[i]+ ", " +nums[j]+ ")   ");
            }
            System.out.println();
        }
        System.out.println("\n\n\n" +tp);
    }                   
    public static void pairsFromi(int nums[])
    {
        for(int i=0 ; i<nums.length ; i++)
        {
            for(int j=i ; j<nums.length ; j++)
            {
                System.out.print("(" +nums[i]+ ", " +nums[j]+ ")   ");
            }
            System.out.println();
        }
    }
    public static void pairsAll(int nums[])
    {
        for(int i=0 ; i<nums.length ; i++)
        {
            for(int j=0 ; j<nums.length ; j++)
            {
                System.out.print("(" +nums[i]+ ", " +nums[j]+ ")   ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        pairsMOREMORE__OPTIMIZRD(arr);
        System.out.println("\n\n\n\n");
        pairsFromi(arr);
        System.out.println("\n\n\n\n");
        pairsAll(arr);
    }    
}
