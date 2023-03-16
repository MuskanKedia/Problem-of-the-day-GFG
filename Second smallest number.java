class Solution
{
    static String secondSmallest(int S, int D)
    {
        int[] num=new int[D];
        for(int i=D-1;i>0;i--)
        {
            int d=Math.min(S-1,9);
            num[i]=d;
            S-=d;
        }
        num[0]=S;
        if(S>9)
            return "-1";
        for(int i=D-1;i>0;i--)
        {
            if(num[i]!=0 && num[i-1]!=9)
            {
                num[i]--;
                num[i-1]++;
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<D;j++)
                    sb.append(num[j]);
                return sb.toString();
            }
        }
        return "-1";
    }
}

//Time Complexity : O(D)
//Space Complexity : O(1)
