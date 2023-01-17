class Solution 
{
    int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    int maxGCD(Node root) 
    {
        int max=0,max_node=0;
        if(root==null)
            return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            if(temp.left!=null && temp.right!=null)
            {
                int x=gcd(temp.left.data,temp.right.data);
                if(x>=max)
                {
                    max=x;
                    max_node=temp.data;
                }
                q.add(temp.left);
                q.add(temp.right);
            }
            else if(temp.left!=null && temp.right==null)
                q.add(temp.left);
            else if(temp.left==null && temp.right!=null)
                q.add(temp.right);
        }
        return max_node;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(N)
