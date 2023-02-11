class Solution 
{
    public static int getMinimumDays(int N, String S, int[] P) 
    {
        char c[]=S.toCharArray();
        int t=0,i,j;
        for(i=0;i<N-1;i++)
        {
           if(c[i]==c[i+1]) t++;
        }
        if(t==0) 
            return 0;
        else
        {
            int ans=0;
            for(i=0;i<N;i++)
            {
                int in=P[i];
                if(in-1>=0 && c[in-1]==c[in]) 
                    t--;
                if(in+1<N && c[in]==c[in+1]) 
                    t--;
                c[in]='?';
                if(t==0)
                {
                    ans=i+1;
                    break;
                }
            }
            return ans;
        }
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)
