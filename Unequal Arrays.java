class Solution {
    public static long solve(int N, int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        reverse(B);
        long numMoves = 0, sumDiffs = 0;
    	  List<Integer> oddNums = new ArrayList<>();
    	  List<Integer> evenNums = new ArrayList<>();
    	  for (int i = 0; i < N; i++) 
	  {
        if (B[i] % 2 == 0)
            evenNums.add(B[i]);
        else
            oddNums.add(B[i]);
    }
    for (int i = 0; i < N; i++) 
    {
        if (A[i] % 2 == 0) 
	  {
            if (evenNums.size() == 0)
                return -1;
            sumDiffs += evenNums.get(evenNums.size() - 1) - A[i];
            
            numMoves += Math.abs(evenNums.get(evenNums.size() - 1) - A[i]) / 2;
            
            evenNums.remove(evenNums.size() - 1);
        } 
	  else 
	  {
            if (oddNums.size() == 0)
                return -1;
            sumDiffs += oddNums.get(oddNums.size() - 1) - A[i];
            numMoves += Math.abs(oddNums.get(oddNums.size() - 1) - A[i]) / 2;
            oddNums.remove(oddNums.size() - 1);
        }
    }
	if (sumDiffs != 0)
        return -1;
    return numMoves / 2;
    }
    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
        
//Time Complexity : O(NlogN)
//Space Complexity : O(N)
