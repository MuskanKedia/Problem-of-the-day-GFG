class Solution {
    ArrayList<Integer> maximumValue(Node node) {
       ArrayList<Integer> res=new ArrayList<Integer>();
        if(node==null)
            return res;
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            int max=Integer.MIN_VALUE;
            int n=queue.size();
            for(int i=0;i<n;i++)
            {
                Node a=queue.poll();
                if(a.left!=null)
                    queue.add(a.left);
                if(a.right!=null)
                    queue.add(a.right);
                if(a.data>max)
                    max=a.data;
            }
            res.add(max);
        }
        return res;
    } 
}

//Time Complexity : O(N) where N is number of nodes
//Space Complexity : O(H) where H is the height of the tree
