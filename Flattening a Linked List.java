class GfG{
    Node flatten(Node root){
        Node ptr = root.next;
        while(ptr!= null){
          root =  merge(root,ptr);
            ptr = ptr.next;
        }
        return root;
    }
    
    Node merge(Node p1, Node p2){
        if(p1 == null) return p2;
        if(p2 == null) return p1;
        if(p1.data <= p2.data){
            p1.bottom = merge(p1.bottom,p2);
            return p1;
        }
        p2.bottom = merge(p1,p2.bottom);
        return p2;
    }
}

//Time Complexity : O(n*m)
//Space Complexity : O(1)
