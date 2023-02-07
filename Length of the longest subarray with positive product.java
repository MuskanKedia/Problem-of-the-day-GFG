class Solution
{
    int maxLength(int arr[], int n) 
    { 
        int i=0;
        int max = 0;
        while(i<n)
        {
            int start = i, end = i, firNeg=-1, lastNeg = -1, count =0;
            while(start < n && arr[start] == 0)
                start++;
            end = start;
            while(end < n && arr[end] != 0)
            {
                if(arr[end] < 0)
                {
                    count++;
                    if(firNeg==-1)
                        firNeg = end;
                    lastNeg = end;
                }
                end++;
            } 
            if(count %2 == 0) 
                max = Math.max(end-start, max);
            else
            {
                if(firNeg != -1) 
                    max = Math.max(end-firNeg-1, max);
                if(lastNeg != -1) 
                    max = Math.max(lastNeg-start, max);
            }
            i = end+1;   
        }
        return max;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)
