class Solution {
    public static int findMoves(int n, int[] chairs, int[] passengers) {
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        int moves = 0;
        for(int i = 0;i<n;i++)
        {
            moves += Math.abs(chairs[i]-passengers[i]);
        }
        return moves;
    }
}

//Time Complexity : O(NlogN)
//Space Complexity : O(1)
