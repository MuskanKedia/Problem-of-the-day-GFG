class Solution
{
    int carpetBox(int A, int B, int C, int D) 
    { 
        int step=0;
        int l1=Math.max(A,B);
        int b1=Math.min(A,B);
        int l=Math.max(C,D);
        int b=Math.min(C,D);
        while(l1>l || b1>b)
        {
            if(l1>l)
                l1=l1/2;
            else
                b1=b1/2;
            A=l1;
            B=b1;
            l1=Math.max(A,B);
            b1=Math.min(A,B);
            step++;
        }
        return step;
    }
}

//Time Complexity : O(max(log(A),log(B)))
//Space Complexity : O(1)
