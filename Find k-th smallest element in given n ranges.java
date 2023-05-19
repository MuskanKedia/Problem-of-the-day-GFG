class Solution {
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        Arrays.sort(range,(a,b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        TreeMap<Integer,int[]> merged = new TreeMap<>();
        merged.put(range[0][0],new int[]{range[0][0],range[0][1],0});
        for(int i = 1;i < range.length;i++){
            var ent = merged.lastEntry();
            var last = ent.getValue();
            if(last[1] < range[i][0]){
                merged.put(range[i][0],new int[]{range[i][0],range[i][1],last[1] - last[0] + 1});
            }
            else{
                last[0] = Math.min(last[0],range[i][0]);
                last[1] = Math.max(last[1],range[i][1]);
            }
        }
        int offset = range[0][0];
        ArrayList<Integer> ans = new ArrayList<>();
        for(var qr:queries){
            var ent = merged.floorEntry(offset + qr);
            var val = ent.getValue();
            int ele = val[0] + (qr - val[2]) - 1; 
            if(ele <= val[1]) ans.add(ele);
            else ans.add(-1);
        }
        return ans;
    }
}

//Time Complexity: O(n * logn + q * logn)
//Space Complexity: O(n)
