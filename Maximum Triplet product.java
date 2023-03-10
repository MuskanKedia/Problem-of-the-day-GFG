class Solution 
{
    Long maxTripletProduct(Long arr[], int n)
    {
        long max1=Integer.MIN_VALUE;
        long max2=max1,max3=max1;
        long min1=Integer.MAX_VALUE;
        long min2=min1;
        for(long val:arr)
        {
            if(val>=max1)
            {
                max3=max2;
                max2=max1;
                max1=val;
            }
            else if(val>=max2)
            {
                max3=max2;
                max2=val;
            }
            else if(val>=max3)
                max3=val;
            if(val<=min1)
            {
                min2=min1;
                min1=val;
            }
            else if(val<=min2)
                min2=val;
        }
        return Math.max(min1*min2*max1,max1*max2*max3);
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
