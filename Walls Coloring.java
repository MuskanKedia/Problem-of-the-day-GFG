class Solution
{
	int minCost(int [][] colors, int N)
	{
        int pink=0,black=0,yellow=0;
        for(int i=0;i<N;i++)
        {
            int cur_pink=Math.min(black,yellow)+colors[i][0];
            int cur_black=Math.min(pink,yellow)+colors[i][1];
            int cur_yellow=Math.min(pink,black)+colors[i][2];
            pink=cur_pink;
            black=cur_black;
            yellow=cur_yellow;
        }
        return Math.min(pink,Math.min(black,yellow));
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
