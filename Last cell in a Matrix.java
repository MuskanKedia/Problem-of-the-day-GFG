class Solution
{
    static int [] endPoints(int [][]matrix, int R, int C)
    {
        int[] res=new int[2];
        char dir='R';
        int i=0,j=0;
        while(i<R && j<C && i>=0 && j>=0)
        {
            
            if(matrix[i][j]==0)
            {
                if(dir=='R')
                    j++;
                else if(dir=='L')
                    j--;
                else if(dir=='D')
                    i++;
                else if(dir=='U')
                    i--;
            }
            else
            {
                matrix[i][j]=0;
                if(dir=='R')
                {
                    i++;
                    dir='D';
                }
                else if(dir=='L')
                {
                    i--;
                    dir='U';
                }
                else if(dir=='D')
                {
                    j--;
                    dir='L';
                }
                else if(dir=='U')
                {
                    j++;
                    dir='R';
                }
            }
        }
        if(i<0)
            i++;
        if(i>=R)
            i--;
        if(j<0)
            j++;
        if(j>=C)
            j--;
        res[0]=i;
        res[1]=j;
        return res;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
