class Solution
{
    public int maxWeightCell(int N, int Edge[])
    {
       int[] weight=new int[N];
       int max=0,index=0;
       for(int i=0;i<N;i++)
       {
           if(Edge[i]!=-1)
           {
               weight[Edge[i]] = weight[Edge[i]]+i;
               if(weight[Edge[i]]>=max)
               {
                   max=weight[Edge[i]];
                   index=Edge[i];
               }
           }
       }
       return index;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(N)
