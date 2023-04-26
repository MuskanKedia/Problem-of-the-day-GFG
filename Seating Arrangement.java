class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        for(int i=0;i<m;i++)
        {
            if(seats[i]==0 && (i==0 || seats[i-1]==0) && (i==m-1 || seats[i+1]==0))
            {
                seats[i]=1;
                n--;
            }
            else if(n==0)
                return true;
        }
        return n<=0;
    }
}
     
//Time Complexity : O(N)
//Space Complexity : O(1)
