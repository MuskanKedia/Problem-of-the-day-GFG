public static void findPreSuc(Node root, int key)
{
     if(root == null) return;
    
    findPreSuc(root.left, key);
    
    if(root.data < key){
        if(pre == null) pre = root;
        else pre.data = Math.max(pre.data, root.data);
    }
    
    if(root.data > key) {
        if(suc == null) suc = root;
        else suc.data = Math.min(suc.data, root.data); 
        return;
    }
    
    findPreSuc(root.right, key);
}

//Time Complexity : O(logN)
//Space Complexity : O(logN)
