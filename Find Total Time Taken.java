

//User function Template for Java

class Solution

{

    public static long totalTime(int n,int arr[],int time[])

    {

        Map<Integer, Long> s = new HashMap<>();

        s.put(arr[0], 0l);

        long ans = 0l;

        for(int i=1 ; i<n ; i++){

            ans++;

            if(!s.containsKey(arr[i])){

                s.put(arr[i], ans);



            }

            else{

                ans += (ans - s.get(arr[i])) >= time[arr[i]-1] ? 0 : time[arr[i]-1] - (ans - s.get(arr[i]));



                s.put(arr[i], ans);

            }

        }

        return ans;

    }

}

//Time Complexity : O(N*N)
//Space Complexity : O(N)
