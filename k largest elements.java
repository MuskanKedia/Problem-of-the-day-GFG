class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        int[] res=new int[k];
        Arrays.sort(arr);
        int j=0;
        for(int i=n-1;i>=n-k;i--){
            res[j++]=arr[i];
        }
        return res;
    }
}

//Time Complexity : O(NlogN)
//Space Complexity : O(1)
