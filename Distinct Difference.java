class Solution 
{
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) 
    {
        HashSet<Integer> setl=new HashSet<>();
        HashSet<Integer> setr=new HashSet<>();
        int[] leftcount=new int[N];
        int[] rightcount=new int[N];
        int left=1,right=N-2;
        while(left<N && right>=0)
        {
            setl.add(A[left-1]);
            setr.add(A[right+1]);
            leftcount[left]=setl.size();
            rightcount[right]=setr.size();
            left++;
            right--;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++)
            list.add(leftcount[i]-rightcount[i]);
        return list;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(N)
