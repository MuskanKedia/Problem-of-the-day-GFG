class Solution 
{
    public static int noConseBits(int n) 
    {
	    return Integer.parseInt(Integer.toBinaryString(n).replaceAll("111", "110"),2);
	}
}

//Time Complexity : O(1)
//Space Complexity : O(1)
