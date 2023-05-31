class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        Arrays.sort(arr);
        int dp[] = new int[arr[n-1]+1];
        for(int i=0;i<n;i++)
        dp[arr[i]]++;
       int min=Integer.MAX_VALUE;
       int max=0;
        for(int i=0;i<dp.length;i++)
        {
           if(dp[i]==0) 
           continue;
           else if(dp[i]<=min)
           {
               if(max<i)
               {
               min=dp[i];
               max=i;
               }
           }
        }
        return max;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(N)
