class Solution 
{
    public int removeStudents(int[] H, int N) 
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<N;i++)
        {
            if(list.isEmpty())
                list.add(H[i]);
            else
            {
                int index=solve(list,H[i]);
                if(index<list.size())
                    list.set(index,H[i]);
                else
                    list.add(H[i]);
            }
        }
        return N-list.size();
    }
    public int solve(ArrayList<Integer> list,int num)
    {
        int low=0,high=list.size()-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(list.get(mid)==num)
                return mid;
            else if(list.get(mid)<num)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }
}

//Time Complexity : O(NlogN)
//Space Complexity : O(N)
