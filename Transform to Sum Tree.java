class Solution{
    public void toSumTree(Node root){
         findsum(root);
    }
    public int findsum(Node node)
    {
        if(node==null)
            return 0;
        int val=node.data;
        node.data=findsum(node.left)+findsum(node.right);
        return val+node.data;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
