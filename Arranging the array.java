class Solution {
    
    public void Rearrange(int a[], int n)
    {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i=0 ; i<a.length ; i++){
            if(a[i] < 0){
                q1.add(a[i]);
            }else{
                q2.add(a[i]);
            }
        }
        int k=0;
        while(!q1.isEmpty()){
            a[k] = q1.remove();k++;
        }
        while(!q2.isEmpty()){
            a[k] = q2.remove();k++;
        }
    }
}

//Time Complexity : O(N)
//Space Complexity : O(N)
