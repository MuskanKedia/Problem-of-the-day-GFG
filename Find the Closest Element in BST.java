class Solution {
    static int minDiff(Node root, int K) {
        if (root == null)
            return Integer.MAX_VALUE;
        if (root.data == K)
            return 0;
        if (root.data > K)
            return Math.min(Math.abs(K - root.data), minDiff(root.left, K));
        if (root.data < K)
            return Math.min(Math.abs(K - root.data), minDiff(root.right, K));
        return Integer.MAX_VALUE;
    }
}

//Time Complexity : O(H)
//Space Complexity : O(H)
