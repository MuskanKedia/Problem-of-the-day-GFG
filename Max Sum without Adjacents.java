class Solution 
{
    int findMaxSum(int arr[], int n) 
    {
        if(n==1)
            return arr[0];
        if(n>2)
            arr[n-3]+=arr[n-1];
        for(int i=n-4;i>=0;i--)
            arr[i]+=Math.max(arr[i+2],arr[i+3]);
        return Math.max(arr[0],arr[1]);
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
