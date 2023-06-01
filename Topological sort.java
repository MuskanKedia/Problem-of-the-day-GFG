class Solution
{
    static void dfs(int src,ArrayList<ArrayList<Integer>> adj,boolean[] vis,Stack<Integer> s)
    {
        vis[src]=true;
        for(int x : adj.get(src))
        {
            if(!vis[x])
            dfs(x,adj,vis,s);
        }
        s.push(src);
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        Stack<Integer> s=new Stack<>();
        boolean[] vis=new boolean[V];
        Arrays.fill(vis,false);
        int a[]=new int[V];
        int indegree[]=new int[V];
        for (int i = 0; i < V; i++)
            if (vis[i] == false)
            {
                dfs(i,adj, vis, s);
            }    
        int i=0;
        while(!s.empty())
        {
            a[i]=s.pop();
            i++;
        }
         return a;
    }
}

//Time Complexity : O(V)
//Space Complexity : O(V)
