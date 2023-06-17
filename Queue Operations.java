class Geeks{
    static void insert(Queue<Integer> q, int k){
        q.add(k);
    }
    static int findFrequency(Queue<Integer> q, int k){
        int c = 0;
        int size = q.size();
        while(size-- > 0) {
            int element = q.remove();
            if(k == element) {
                c++;
            }
            q.add(element);
        }
        return c;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
