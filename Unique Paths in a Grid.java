class Solution {
    static int uniquePaths(int n, int m, int[][] grid) {
        
        int mod = 1000000007;

        for(int i=0;i<n;i++){
           
            for(int j=0;j<m;j++){
               
                if(grid[i][j] ==0) continue;
               
                if(i-1<0 && j-1<0){
                    continue;
                }else
                if(i-1<0){
                    if(grid[i][j-1]==0)
                        grid[i][j]=0;
                    else
                        grid[i][j]=grid[i][j-1];
                   
                }else
                if(j-1<0){
                    if(grid[i-1][j]==0)
                        grid[i][j]=0;
                    else
                        grid[i][j]=grid[i-1][j];
                   
                }else{
                    grid[i][j] = (grid[i-1][j] + grid[i][j-1])%mod;
                }
               
            }
        }
       
        return grid[n-1][m-1];
    }
}

//Time Complexity : O(N*M)
//Space Complexity : O(1)
