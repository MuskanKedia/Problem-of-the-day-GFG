class Solution 
{ 
    static int xmod11(String x)
	{    
	    int sum=0;
	    for(int i=0;i<x.length();i++)
	        sum=(sum*10+(x.charAt(i)-'0'))%11;
	    return sum;
   }
}

//Time Complexity : O(|x|)
//Space Complexity : O(1)
