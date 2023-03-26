class Solution 
{
    public int unvisitedLeaves(int N, int leaves, int frogs[]) 
    {
        boolean[] vis=new boolean[leaves+1];
        for(int i=0;i<N;i++)
        {
            int j=0;
            if(frogs[i]<=leaves && vis[frogs[i]])
                continue;
            while(j<=leaves)
            {
                vis[j]=true;
                j+=frogs[i];
            }
        }
        int ans=0;
        for(int i=1;i<=leaves;i++)
            if(!vis[i])
                ans++;
        return ans;
    }
}

//Time Complexity : O(N*log(leaves))
//Space Complexity : O(leaves)
