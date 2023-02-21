class Solution
{
	public static int minIteration(int N, int M, int x, int y)
	{
		int top=x-1;
        int left=y-1;
        int down=N-x;
        int right=M-y;
        return Math.max(top+left,Math.max(down+left,Math.max(down+right,top+right)));
	}
}

//Time Complexity : O(1)
//Space Complexity : O(1)
