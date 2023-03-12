class Solution 
{
    public int[] findMaxRow(int mat[][], int N) 
    {
        int row=0,j=N-1;
        for(int i=0;i<N;i++)
        {
            while(j>=0 && mat[i][j]==1)
            {
                row=i;
                j--;
            }
        }
        return new int[]{row,N-1-j};
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
