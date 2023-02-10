class Solution 
{
    public int maxInstance(String s) 
    {
        int res=0;
        String str="balloon";
        int[] count=new int[26];
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)-97]++;
        int temp=0;
        for(int i=0;i<str.length();i++)
        {
            if(--count[str.charAt(i)-97]>=0)
                temp++;
            else
                return res;
            if(temp==str.length())
            {
                temp=0;
                res++;
                i=-1;
            }                 
        }
        return res;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(26)
