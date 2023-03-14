class Solution{
    int maxCoins(int N, ArrayList<Integer> arr) {
		return f(arr,0,N-1,new Integer[N][N]);
	}
	
	public static int f(ArrayList<Integer> arr,int lo,int hi,Integer[][] dp) {
	    if(lo>hi) return 0;
	    
	    if(dp[lo][hi]!=null) return dp[lo][hi];
	    
	    int ans=0;
	    for(int i=lo;i<=hi;i++) {
	        int val=arr.get(i);
	        if(lo-1>=0) val*=arr.get(lo-1);
	        if(hi+1<arr.size()) val*=arr.get(hi+1);
	        val += (f(arr,lo,i-1,dp) + f(arr,i+1,hi,dp));
	        
	        ans = Math.max(ans,val);
	    }
	    return dp[lo][hi]=ans;
	}
}

//Time Complexity : O(N^3)
//Space Complexity : O(N^2)
