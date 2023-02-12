class Solution
{
    boolean isPrime(int d)
    {
        for(int i=2;i*i<=d;i++)
        {
            if(d%i==0)
                return false;
        }
        return true;
    }
    Node primeList(Node head)
    {
        Node temp=head;
        int temp1=0,temp2=0;
        while(temp!=null)
        {
            int data=temp.val;
            if(data==1)
            {
                temp.val=2;
                continue;
            }
            temp1=data;
            temp2=data;
            while(!isPrime(temp2))
                temp2++;
            while(!isPrime(temp1)&&temp1>0)
                temp1--;
            if(data-temp1<=temp2-data)
                data=temp1;
            else
                data=temp2;
            temp.val=data;
            temp=temp.next;
        }
        return head;
    }
}

//Time Complexity : O(number of nodes * sqrt(value of node))
//Space Complexity : O(1)
