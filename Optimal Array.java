class Solution 
{
    public long[] optimalArray(int n,int a[])
    {
        long res[] = new long[n];
        for(int i=1;i<n;i++)
            res[i]=a[i]-a[i/2]+res[i-1];
        return res;
    }
 
}
      
//Time Complexity : O(N)
//Space Complexity : O(1)
