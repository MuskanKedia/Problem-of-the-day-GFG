class Solution 
{
    long[] countZero(int N, int K, int[][] arr)
    {
        long freeCells = N*N;
        boolean[] filledRows = new boolean[N];
        boolean[] filledCols = new boolean[N];
        int rowCount = 0 , colCount = 0;
        long[] ans = new long[K];
        
        for(int i = 0 ; i < K ; i++)
        {
            
            int row = arr[i][0];
            int col = arr[i][1];

            if(!filledRows[row-1])
            {
                freeCells -= (N-colCount);
                filledRows[row-1] = true;
                rowCount++;
            }

            if(!filledCols[col-1])
            {
                freeCells -= (N-rowCount);
                filledCols[col-1] = true;
                colCount++;
            }
            
            ans[i] = freeCells;
        }
        return ans;
    }
}

//Time Complexity : O(k)
//Space Complexity : O(n+n+k)
