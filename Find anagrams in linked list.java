class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String S) {
    ArrayList<Node> ans = new ArrayList<>();
    int j = 0;
    Node prev = head, curr = head;
    while (curr != null) {  
        int arr[] = new int[26];
        for (int i = 0; i < S.length(); i++)
            arr[S.charAt(i) - 'a']++;
        while (j < S.length() && curr != null) {
            if (--arr[curr.data - 'a'] >= 0) {
                j++;
                curr = curr.next;
            } else {
                break;
            }
        }
        if (j == S.length() && checkAllZeroes(arr)) {
            Node temp = new Node('x');
            Node ptr = temp;
            while (j > 0) {
                temp.next = new Node(prev.data);
                prev = prev.next;
                temp = temp.next;
                j--;
            }
            ans.add(ptr.next);
        } else {
            prev = prev.next;
            j = 0;
        }
        curr = prev;
    }
    return ans;
}
static boolean checkAllZeroes(int arr[]) {
    for (int i : arr)
        if (i != 0)
            return false;
    return true;
}
}

//Time Complexity : O(n*m)
//Space Complexity : O(n)
