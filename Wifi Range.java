class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        int dist=X;
        for(int i=0;i<N;i++)
        {
            if(S.charAt(i)=='1')
            {
                if(dist>2*X)
                    return false;
                dist=0;
            }
            else
                dist++;
        }
        if(dist>X)
            return false;
        return true;
    }
} 

//Time Complexity : O(N)
//Space Complexity : O(1)
