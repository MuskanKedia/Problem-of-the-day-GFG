class Solution
{
    long ans = 0;
    long verticallyDownBST(Node root,int target)
    {
        Node t = find(root, target);
        if(t == null) return -1;
        solve(t, 0);
        return ans-t.data;
    }
    
    void solve(Node root,int d)
    {
        if(root == null) return;
        if(d == 0) ans += root.data;
        solve(root.left, d-1);
        solve(root.right, d+1);
    }
    Node find(Node root,int t)
    {
        if(root == null) return null;
        if(root.data == t) return root;
        else if(root.data < t) return find(root.right, t);
        else return find(root.left, t);
        
    }
}

//Time Complexity : O(n) where n is number of nodes
//Space Complexity : O(H) where H is height of the tree
