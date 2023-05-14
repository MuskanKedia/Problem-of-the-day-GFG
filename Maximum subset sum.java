class Solution {
    public static long findMaxSubsetSum(int N, int[] A) {
        long[] prev = new long[2];
        long[] cur = new long[2];
        prev[0] = 0;
        prev[1] = A[0];
    
        for (int i = 1; i < N; i++) {
            cur[1] = A[i] + Math.max(prev[0], prev[1]);
            cur[0] = prev[1];
    
            prev = cur.clone();
        }
        return Math.max(prev[0], prev[1]);
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
