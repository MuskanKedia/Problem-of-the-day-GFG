class Solution
{
	int equalSum(int [] A, int N) 
	{
	    int left=0,right=0;
	    for(int a:A)
	        right=right+a;
		for(int i=0;i<N;i++)
		{
		    right=right-A[i];
		    if(left==right)
		        return i+1;
		    left=left+A[i];
		}
		return -1;
	}
}

//Time Complexity : O(N)
//Space Complexity : O(1)
