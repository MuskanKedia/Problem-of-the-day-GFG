class Solution 
{
    int solve(int N, int[] A) 
    {
        while(A[N-1]==9)
            N--;
        return N;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
