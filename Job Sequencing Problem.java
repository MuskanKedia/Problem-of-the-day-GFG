class Solution
{
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a, b)-> a.deadline-b.deadline);
        PriorityQueue<Job> pq = new PriorityQueue<>((a, b)-> b.profit-a.profit);
        
        int count = 0, sum = 0;
        for(int i=n-1; i>=0; i--) {
            
            int slot = 0;
            if(i == 0) slot = arr[i].deadline;
            else slot = arr[i].deadline-arr[i-1].deadline;
            
            pq.add(arr[i]);
            
            while(slot>0 && pq.size()>0) {
                
                Job job = pq.poll();
                count++;
                sum+=job.profit;
                
                slot--;
            }
        }
        
        return new int[]{count, sum};
    }
}

//Time Complexity : O(NlogN)
//Space Complexity : O(N)
