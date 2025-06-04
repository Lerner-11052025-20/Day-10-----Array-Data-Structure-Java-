public class BSA 
{
    public static int bas(int nums[], int key)
    {
        // always on the sorted array
        int i = 0;
        int j = nums.length-1; // 5-1 = 4
        while(i<=j)
        {
            int midIndex = (i+j)/2;
            int midValue = nums[midIndex];

            if(key == midValue)     return midIndex;
            else if(key > midValue)     i = midIndex+1;
            else    j = midIndex-1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        int target = 10;

        System.out.println(bas(arr, target));
    }
}
