class Solution
{
	long no_of_subarrays(int N, int [] arr) 
  {
	  long count = 0; 
    long zeros = 0;
    for (int i = 0; i < N; i++) 
    {
        if (arr[i] == 0)
            zeros++; 
        else 
        {
            count += (zeros * (zeros + 1)) / 2; 
            zeros = 0;
        }
    }
    count += (zeros * (zeros + 1)) / 2; 
    return count; 
	}
}

//Time Complexity : O(N)
//Space Complexity : O(1)
