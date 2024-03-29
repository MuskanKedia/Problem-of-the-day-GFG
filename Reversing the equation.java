class Solution {
    String reverseEqn(String S) {
        String[] arr = S.split("[+*-/]");
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : S.toCharArray()) {
            if (isOperator(c)) {
                st.push(c);
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (!st.isEmpty()) {
                sb.append(st.pop());
            }
        }

        return sb.toString();
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}

//Time Complexity : O(|S|)
//Space Complexity : O(|S|)
