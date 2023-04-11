class Solution 
{
    int solve(int a, int b, int c) 
    {
        int max=Math.max(a,Math.max(b,c));
        int sum=a+b+c;
        int min=sum-max;
        if(2*min+2<max)
            return -1;
        return sum;
    }
}

//Time Complexity : O(1)
//Space Complexity : O(1)
