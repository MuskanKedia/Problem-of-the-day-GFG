class Solution 
{
    public static int findFirstNode(Node head)
    {
        Node first=head;
        Node second=head;
        boolean iscycle=false;
        while(second.next!=null && second.next.next!=null)
        {
            first=first.next;
            second=second.next.next;
            if(first==second)
            {
                iscycle=true;
                break;
            }
        }
        if(!iscycle)
            return -1;
        first=head;
        while(first!=second)
        {
            first=first.next;
            second=second.next;
        }
        return first.data;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
