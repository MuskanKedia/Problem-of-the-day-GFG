class Solution 
{
    public long minIncrements(int[] arr, int N) 
    {
        int c=0;
        Arrays.sort(arr);
        for(int i=0;i<N-1;i++)
        {
            while(arr[i]>=arr[i+1])
            {
                arr[i+1]+=1;
                c++;
            }
        }
        return c;
    }
}

//Time Complexity : O(nlogn)
//Space Complexity : O(1)
