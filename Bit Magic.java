class Solution {
    public static int bitMagic(int n, int[] arr) {
        int count = 0;
        for(int leftIdx=0, rightIdx = arr.length - 1; leftIdx < rightIdx; leftIdx++, rightIdx--)
        {
            if(arr[leftIdx] != arr[rightIdx])
            {
                count++;
            }
        }
        if(count % 2 == 1) count++;
        return count/2;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(N)
