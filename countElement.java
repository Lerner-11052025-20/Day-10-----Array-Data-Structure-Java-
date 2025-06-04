public class countElement 
{
    public static boolean count(int nums[])
    {
        for(int i=0 ; i<nums.length ; i++)
        {
            int count=1;
            for(int j=i+1 ; j<nums.length ; j++)
            {
                if(nums[i] == nums[j])  count++;
            }
            System.out.println(count);
            if(count > 1)   return true;
        }        
        return false;
    }
    public static void main(String args[])
    {
        int nums[] = {1, 1, 1, 55, 44, 4, 4};
        System.out.println(count(nums));
    }    
}
