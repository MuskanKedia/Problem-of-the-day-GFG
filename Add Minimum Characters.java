class Solution
{
	public static int addMinChar(String str)
	{
		int count=0,i=0,j=str.length()-1;
		while(i<j)
		{
		    if(str.charAt(i)==str.charAt(j))
		    {
		        i++;
		        j--;
		    }
		    else
		    {
		        count++;
		        i=0;
		        j=str.length()-1-count;
		    }
		}
		return count;
	}
}

//Time Complexity : O(N*N)
//Space Complexity : O(1)
