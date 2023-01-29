class Solution 
{
    public static int solve(int a, int b) 
    {
        if(a==b)
            return 0;
        if((a&b)==a || (a&b)==b)
            return 1;
        return 2;
    }
}

//Time Complexity : O(1)
//Space Complexity : O(1)
