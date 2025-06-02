public class TrappedWaterMediumLevelQuestion 
{
    public int trap(int[] height) {
        if(height.length == 1 || height.length ==2)     return 0;     

        int n = height.length;
        
        //leftMax Auxiliary Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1 ;  i<n ; i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
            //      1                   1,          0
            // 4 4 4 6 6 6 6 
        }

        //rightMax auxiliary array
        int rightMax[] = new int[n];
        rightMax[n-1]  = height[n-1];
        for(int i=n-2 ; i>=0 ; i--)
        {       // n-2 5 4 3 2 1 0
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
                // 5                       5 ,          6
        }          //               6 6 6 6 5 5 5

        //WL calc
        int wL=0, tW=0;
        for(int i=0 ; i<n ; i++)
        {            
            wL = Math.min(leftMax[i] , rightMax[i]);
            tW += wL - height[i];
        }

        return tW;
    }

    public static void notOptimized(int height[])
    {        
        int mR, mL, wL, tW, sum=0;
        for(int i=0 ; i<height.length ; i++)
        {
            mL = mR = wL = tW = 0;
            if(i == 0)      mL=height[0];
            if(i == height.length-1)    mR=height[height.length-1];
            for(int j=0 ; j<i ; j++)    mL = Math.max(mL, height[j]);
            for(int j=i+1 ; j<height.length ; j++)  mR = Math.max(mR, height[j]);
            wL = Math.min(mL, mR);
            tW = wL-height[i] ;
            if(tW < 0)  tW = 0;
            sum += tW;
        }
        System.out.println("\n" +sum);
    }

    public static void main(String args[])
    {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        if(height.length == 1 || height.length ==2)     System.out.println("invalid input of height array");

        int sum=0;
        
        int mR, mL, wL, tW;
        for(int i=0 ; i<height.length ; i++)
        {
            mL = mR = wL = tW = 0;
            if(i == 0)      mL=height[0];
            if(i == height.length-1)    mR=height[height.length-1];
            for(int j=0 ; j<i ; j++)
            {
                mL = Math.max(mL, height[j]); // aa concept ma hu tene ith element 6 ne leto nathi pan auxiliary array na concept ma hu tene and tana karta nana LHS valo i-1 valo sathe compare karish
            }
            // 4 2 0 6 3 2 5 
            for(int j=i+1 ; j<height.length ; j++)
            {
                mR = Math.max(mR, height[j]);
            }

            wL = Math.min(mL, mR);
            tW = wL-height[i] ;
            if(tW < 0)  tW = 0;
            sum += tW;
        }

        //optimized karva no j code ne O(n^2) mathi O(n)
        //ny using the concept of a helper arrays or an Auxiliary Arrays

        System.out.println(sum);
        TrappedWaterMediumLevelQuestion obj = new TrappedWaterMediumLevelQuestion();
        System.out.println(obj.trap(height));

        notOptimized(height);

    }
}
