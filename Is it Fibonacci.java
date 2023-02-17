class Solution 
{
    static long solve(int N, int K, ArrayList<Long> GeekNum) 
    {
        long[] arr=new long[N];
        long sum=0;
        int i=0;
        for(i=0;i<GeekNum.size();i++)
        {
            arr[i]=GeekNum.get(i);
            if(GeekNum.size()-i<=K)
                sum=sum+arr[i];
        }
        while(i<N)
        {
            arr[i]=sum;
            sum=sum+arr[i]-arr[i-K];
            i++;
        }
        return arr[N-1];
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)
