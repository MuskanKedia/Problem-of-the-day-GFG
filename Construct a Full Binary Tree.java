class Solution
{
    public int find(int a[],int lo,int hi,int key)
    {
        for(int i=lo;i<=hi;i++)
        {
        if(a[i]==key)
        return i;
        }
        return -1;
    }
    public Node construct(int pre[],int preM[],int lo,int hi,int l,int h)
    {
        if(lo>hi)
        return null;
        Node root=new Node(pre[lo]);
        if(lo==hi)
        return root;
        int x=find(pre,lo+1,hi,preM[l+1]);
        root.left=construct(pre,preM,lo+1,x-1,l+(hi-x+1)+1,h);
        root.right=construct(pre,preM,x,hi,l+1,l+(hi-x+1));
        return root;
    }
    public Node constructBTree(int pre[], int preM[], int size)
    {
        return construct(pre,preM,0,size-1,0,size-1);
    }
}

//Time Complexity : O(N*N)
//Space Complexity : O(N)
