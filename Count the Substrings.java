class Solution 
{ 
    boolean islower(char ch)
    {
        return ch>='a'&&ch<='z';
    }
    int countSubstring(String S) 
    { 
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            int lower=0,upper=0;
            for(int j=i;j<S.length();j++)
            {
                if(islower(S.charAt(j)))
                    lower++;
                else
                    upper++;
                if(lower==upper)
                    count++;
            }
        }
        return count;
    }
} 

//Time Complexity : O(N*N)
//Space Complexity : O(1)
