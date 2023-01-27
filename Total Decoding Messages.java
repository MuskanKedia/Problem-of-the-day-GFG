class Solution
{
    public static final int mod = 1000000007;
    public int CountWays(String s)
    {
        int n = s.length();
		    int curr = 0, next = 1, nextnext = 0;
		    for(int i = n - 1; i >= 0; i--){
		        curr = 0;
		        if(s.charAt(i) != '0'){
    		        curr = next;
    		        if(i + 1 < n){
    		            int nextnum = (s.charAt(i) - '0') * 10 + (s.charAt(i+1) - '0');
    		            if(nextnum <= 26)
    		                curr = (curr + nextnext) % mod;
    		         }
		        }
		        nextnext = next;
		        next = curr;
		    }
		    return curr;
		}
}

//Time Complexity : O(N)
//Space Complexity : O(1)
