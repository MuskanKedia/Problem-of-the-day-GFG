class Solution {
    long minimizeSum(int N, int arr[]) {
        long sum=0;
        PriorityQueue<Long> q=new PriorityQueue<>();
        for(int i:arr)
            q.offer((long)i);
        while(q.size()>1)
        {
            long a=q.poll();
            long b=q.poll();
            sum=sum+a+b;
            q.offer(a+b);
        }
        return sum;
    }
}

//Time Complexity : O(nlogn)
//Space Complexity : O(n)
