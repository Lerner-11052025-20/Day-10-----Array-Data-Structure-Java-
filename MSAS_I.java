public class MSAS_I 
{
    public static void subArrays(int nums[])
    {
        int subArr = 0 , sum, max=Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++)
        {
            System.out.println("All subArrays of " +nums[i]+ "'s element");
            for(int j=i ; j<nums.length ; j++)
            {
                sum = 0;
                System.out.print("[ ");
                for(int k=i ; k<=j ; k++)
                {
                    System.out.print(nums[k]+ " ");
                    sum += nums[k];
                }
                System.out.println("]");
                subArr++;
                if(max < sum)   max = sum;
            }           
            System.out.println();
        }
        System.out.println(subArr);
        System.out.println(max);
    }                   

    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        subArrays(arr);


    }    
}

