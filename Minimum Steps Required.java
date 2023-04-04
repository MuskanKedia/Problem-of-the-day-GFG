class Solution
{
	int minSteps(String str) 
	{
	    int pairs=1;
        for(int i=1;i<str.length();i++)
            if(str.charAt(i)!=str.charAt(i-1))
                pairs++;
        return pairs/2+1;         
	}
}

//Time Complexity : O(N)
//Space Complexity : O(1)
