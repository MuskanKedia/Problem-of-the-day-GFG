class Solution {
    public static int arrayOperations(int n, int[] arr) {
         int count=0, zero=0;
        boolean flag=false;
        for(int i=0;i<n;i++)
            if(arr[i]==0)
                zero++;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                if(flag==false)
                {
                    count++;
                    flag=true;
                }
            }
            else
                flag=false;
        }
        if(zero==0)
            return -1;
        else
            return count;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
