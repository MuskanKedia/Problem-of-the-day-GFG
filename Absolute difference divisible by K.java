class Solution {
	static long countPairs(int n, int[] arr, int k) {
		int count=0;
		long[] rem=new long[k];
        for(int i=0;i<n;i++)
        {
            rem[arr[i]%k]++;
        }
        for(int i=0;i<k;i++)
        {
            count+=((rem[i]-1)*rem[i])/2;
        }
        return count;
	}
}

//Time Complexity : O(N)
//Space Complexity : O(N) for array
