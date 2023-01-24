class Solution 
{
    void convert(int[] arr, int n) 
    {
        int[] temp=new int[n];
        for(int i=0;i<n;i++)
            temp[i]=arr[i];
        Arrays.sort(temp);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]==temp[j])
                {
                    arr[i]=j;
                    break;
                }
            }
        }
    }
}

//Time Complexity : O(NlogN)
//Space Complexity : O(N)
