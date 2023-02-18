class Solution{
    public static int appleSequence(int n, int m, String arr){
        int maxlen=0;
        int end=0,start=0;
        int count=0;
        while(end<n)
        {
            if(arr.charAt(end)=='O') count++;
            while(start<n && count>m)
            {
                if(arr.charAt(start)=='O') count--;
                start++;
            }
            maxlen=Math.max(maxlen,end-start+1);
            end++;
        }
        return maxlen;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(N)
