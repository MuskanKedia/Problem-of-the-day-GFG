class Solution 
{
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) 
    {
        int[] fre = new int[N];
        for(int i=0;i<N;i++) 
        {
            for(int j=i;j<N;j++) 
                if(A[i]==A[j]) 
                    fre[i]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int[] q : Q) 
        {
            int f=0;
            for(int i=q[0];i<=q[1];i++)
                if(fre[i]==q[2]) 
                    f++;
            list.add(f);
        }
        return list;
    }
}
     
//Time Complexity : O(N^2)
//Space Complexity : O(N)
