class Solution{
	int [] updateQuery(int N, int Q, int [][]U){
        int[] ans = new int[N];
        for(int[] temp : U){
            int l = temp[0]-1 , r = temp[1] , x = temp[2];
            while(l < r){
                ans[l] = ans[l] | x;
                l++;
            }
        }
        return ans;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1) 
