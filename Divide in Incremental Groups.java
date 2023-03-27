class Solution {
     public int countWaystoDivide(int n, int k) 
     {
        Integer dp[][][]=new Integer[k+1][n+1][n+1];
        return f(1,n,k,dp);
    }
    int f(int prev, int n, int k, Integer dp[][][])
    {
        if(k==1)
        {
            if(n>=prev)
                return 1;
            return 0;
        }
        if(n<=0)
            return 0;
        if(dp[k][prev][n]!=null)
            return dp[k][prev][n];
        int ways=0;
        for(int i=prev; i<=n; i++)
            ways+=f(i,n-i,k-1,dp);
        return dp[k][prev][n]=ways;
    }
}

//Time Complexity : O(k*n*n)
//Space Complexity : O(k*n*n)
