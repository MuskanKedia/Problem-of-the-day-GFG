class Solution 
{
    public static int minimumTime(int N, int cur, int[] pos, int[] time) 
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            min=Math.min(min,(Math.abs(cur-pos[i])*time[i]));
        }
        return min;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
