class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	Node cur=head,nthcur=head;
    	while(n!=0)
    	{
    	    if(cur==null)
    	        return -1;
    	    cur=cur.next;
    	    n--;
    	}
    	while(cur!=null)
    	{
    	    cur=cur.next;
    	    nthcur=nthcur.next;
    	}
    	if(nthcur!=null)
    	    return nthcur.data;
    	return -1;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1) 
