class Solution
{
    public static long distinctColoring(int N, int[]r, int[]g, int[]b)
    {
        long r1=0,g1=0,b1=0;
        long nextr1=0,nextg1=0,nextb1=0;
        for(int i=N-1;i>=0;i--)
        {
            r1=Math.min(nextg1,nextb1)+r[i];
            g1=Math.min(nextr1,nextb1)+g[i];
            b1=Math.min(nextr1,nextg1)+b[i];
            nextr1=r1;
            nextg1=g1;
            nextb1=b1;
        }
        return Math.min(r1,Math.min(g1,b1));
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
