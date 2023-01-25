class Solution 
{
    int minOperation(String s) 
    {
        int i=1,op=0,start=0;
        boolean flag=false;
        while(i*2<s.length())
        {
            if(s.substring(0,i).equals(s.substring(i,2*i)))
            {
                op=i+2;
                flag=true;
                start=2*i+1;
            }
            i++;
        }
        if(flag)
            op=op+s.length()-start;
        else
            op=s.length();
        return op;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
