public class SubArray 
{
    public static void subArrays(int nums[])
    {
        int subArr = 0;
        for(int i=0 ; i<nums.length ; i++)
        {
            System.out.println("All subArrays of " +nums[i]+ "'s element");
            for(int j=i ; j<nums.length ; j++)
            {
                System.out.print("[ ");
                for(int k=i ; k<=j ; k++)
                {
                    System.out.print(nums[k]+ " ");
                }
                System.out.println("]");
                subArr++;
            }           
            System.out.println();
        }
        System.out.println(subArr);
    }                   

    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        subArrays(arr);


    }    
}
