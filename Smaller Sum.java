class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        long ans[] = new long[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[0]<=b[0]?-1:1));
        for(int i=0;i<n;i++) pq.offer(new int[]{arr[i],i});
        long sum=0;
        long currS=0;
        while(!pq.isEmpty()){
            int a[] = pq.poll();
            ans[a[1]] = sum;
            currS += a[0];
            while(!pq.isEmpty() && pq.peek()[0]==a[0]){
                ans[pq.peek()[1]] = sum;
                currS+=pq.poll()[0];
            }
            sum= currS;
        }
        return ans;
    }
}

//Time Complexity : O(NlogN)
//Space Complexity : O(N)
