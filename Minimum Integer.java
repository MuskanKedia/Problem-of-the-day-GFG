class Solution 
{
    public static int minimumInteger(int N, int[] A) 
    {
        long sum=0;
        int x=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
            sum=sum+A[i];
        long div=sum/N;
        long temp;
        if(div*N==sum)
            temp=div;
        else
            temp=div+1;
        for(int i=0;i<N;i++)
            if(temp<=A[i])
                x=Math.min(x,A[i]);
        return x;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
