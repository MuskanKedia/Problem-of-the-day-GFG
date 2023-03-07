class Solution 
{
    public int maxLevelSum(Node root) 
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
            int size=q.size(),sum=0;
            for(int i=0;i<size;i++)
            {
                Node val=q.poll();
                sum=sum+val.data;
                if(val.left!=null)
                    q.add(val.left);
                if(val.right!=null)
                    q.add(val.right);
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }
}

//Time Complexity : O(N), where N is no of node
//Space Complexity : O(W), Where W is the max width of the tree
