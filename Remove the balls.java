class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < N; i++) {
            if (!st.isEmpty() && st.peek() == color[i] && st.get(st.size() - 2) == radius[i]) {
                st.pop();
                st.pop();
            } else {
                st.push(radius[i]);
                st.push(color[i]);
            }
        }
        return st.isEmpty() ? 0 : st.size() / 2;
    }
}
        
//Time Complexity : O(N)
//Space Complexity : O(N)
