public class MSAS_III_KadanesAlgo 
{
    public static void subArrays(int nums[])
    {
        int cs=0,ms=0;
        for(int i=0 ; i<nums.length ; i++)
        {
            cs += nums[i];
            if(cs<0)    cs=0;
            ms = Math.max(ms, cs);
        }
        System.out.println(ms);
    }
    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        subArrays(arr);
    }    
}
