class Solution {
    static boolean isStraightHand(int N, int groupSize, int hand[]) {
         if(N%groupSize !=0 ) return false;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(hand);
        
        for(int i: hand){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i=0;i<N;i++){
            if(map.containsKey(hand[i])){
                for(int j=hand[i];j<hand[i]+groupSize;j++){
                    if(!map.containsKey(j)) return false;
                    map.put(j,map.get(j)-1);
                    if(map.get(j)==0) map.remove(j);
                }
            }
        }
        
        return true;
    }
}

//Time Complexity : O(NlogN)
//Space Complexity : O(N)
