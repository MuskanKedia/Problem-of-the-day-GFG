class Solution {
    public long minOperations(int N) {
        if(N==1)
            return 0;
        long mid=N/2;
        long n=N;
        long ans=mid*n-mid*mid;
        return ans;
    }
}

//Time Complexity : O(1)
//Space Complexity : O(1)
