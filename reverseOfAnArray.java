public class reverseOfAnArray 
{
    public static void reverseNotOptimized(int nums[])
    {
        int temp[] = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++)  temp[i] = nums[nums.length-1-i];
        for(int i=0 ; i<nums.length ; i++)  nums[i] = temp[i];        
    }

    public static void reverseOptimized(int nums[])
    {
        int i=0;
        int j=nums.length-1; //5-1 = 4
        while(i<j)
        {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;

            i++;
            j--;
        }
    }
    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        for(int i=0 ; i<arr.length ; i++)  System.out.print(arr[i]+ " ");        
        
        System.out.println();
        // reverseNotOptimized(arr);
        for(int i=0 ; i<arr.length ; i++)  System.out.print(arr[i]+ " "); 
        
        System.out.println();
        reverseOptimized(arr);
        for(int i=0 ; i<arr.length ; i++)  System.out.print(arr[i]+ " ");        
        

    }    
}
