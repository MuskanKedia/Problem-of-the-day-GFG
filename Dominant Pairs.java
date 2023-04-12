class Solution 
{
    public static int dominantPairs(int n, int[] arr) 
    {
        Arrays.sort(arr,0,n/2);
        Arrays.sort(arr,n/2,n);
        int count=0,finalcount=0,j=n/2;
        boolean flag=false;
        for(int i=0;i<n/2;i++)
        {
            while(j<n && arr[i]>=5*arr[j])
            {
                count++;
                j++;
                flag=true;
            }
            if(flag)
                finalcount+=count;
        }
        return finalcount;
    }
}

//Time Complexity : O(NlogN)
//Space Complexity : O(1)
