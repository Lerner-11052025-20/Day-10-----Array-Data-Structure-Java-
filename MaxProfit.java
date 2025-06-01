public class MaxProfit 
{
    public static void maxProfit(int nums[])
    {
        int maxProfit = 0, buyPriceMIN = Integer.MAX_VALUE ;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(buyPriceMIN > nums[i])
            {
                buyPriceMIN = nums[i];
            }
            else
            {
                int profit = nums[i] - buyPriceMIN;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        System.out.println(maxProfit);
        
    }
    public static void main(String args[])
    {
        int prices[] = {7, 1, 5, 2, 6, 10};
        maxProfit(prices);
    }    
}
