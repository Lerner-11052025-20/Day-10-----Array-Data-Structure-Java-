public class LSA
{
    public static int twoSum(int nums[], int t)
    {
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] == t)    return i;   
        }

        return -1;
    }

    public static void twoSum2(int nums[], int t)
    {
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] == t)
            {
                System.out.println(i);
            }   
        }
    }

    public static int[] twoSumOrignal(int[] nums, int t)
    {
        int r[] = new int[2];
        //          0 1 2 3 4<4 no   <4=5-1
        for(int i=0 ; i<nums.length-1 ; i++)
        {
            for(int j=i+1 ; j<nums.length ; j++)
            {
                if(nums[i] + nums[j] == t)
                {
                    r[0] = i;
                    r[1] = j;
                    return r;
                }
            }   
        }
        r[0] = -1;
        r[1] = -1;
        return r;
    }


    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        int target = 10;
        // System.out.println(twoSum(arr, target));
        // twoSum2(arr, target);

        target=19;
        int rnew[];
        rnew = twoSumOrignal(arr, target);
        System.out.println(rnew[0]+ " " +rnew[1]);        
    }
}