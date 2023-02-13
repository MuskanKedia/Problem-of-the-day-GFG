class Solution
{
    static int inSequence(int A, int B, int C)
    {
        if(C==0)
        {
            if(A!=B)
                return 0;
        }
        if(A==B)
            return 1;
        if((B-A)%C==0)
        {
            if((B-A)/C>0)
                return 1;
        }
        return 0;
    }
}

//Time Complexity : O(1)
//Space Complexity : O(1)
