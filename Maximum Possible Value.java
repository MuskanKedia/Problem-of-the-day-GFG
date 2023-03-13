class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) 
    { 
        long sticks=0,sum=0,minlength=Long.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            int curlength=A[i];
            int curcount=B[i];
            if(curcount%2==1)
                curcount-=1;
            if(curcount==0)
                curlength=Integer.MAX_VALUE;
            sticks+=curcount;
            minlength=Math.min(minlength,curlength);
            sum+=curlength*curcount;
        }
        if(sticks%4!=0)
            sum-=2*minlength;
        return sum;
    }
} 

//Time Complexity : O(N)
//Space Complexity : O(1)
