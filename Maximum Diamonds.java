class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : A) 
        pq.add(x);
        long ans =0;
        for (int i=0; i<K;i++) {
            int curr = pq.remove();
            ans+= curr;
            pq.add(curr/2);
        }
        return ans;
    }
}

//Time Complexity : O(NlogK)
//Space Complexity : O(N)
