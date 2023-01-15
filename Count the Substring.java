class Solution {
    long countSubstring(String S){
    long res=0;
   HashMap<Long,Integer> hm=new HashMap<>();
   long[] dp=new long[S.length()];
   long sum=-1;
   if(S.charAt(0)=='1'){
    dp[0]=1;
    res=1;
    sum=1;
   }
  hm.put(sum,0);
  hm.put((long) 0,-1);
  for(int i=1;i<S.length();i++){
    long tt=0;
    if(S.charAt(i)=='0'){
      sum-=1;
    }
    else{
      sum+=1;
    }
    if(S.charAt(i)=='0'){
      if(hm.containsKey(sum)){
        if(hm.get(sum)!=-1){
          tt+=dp[hm.get(sum)];
        }
      }
    }
    else{
      if(hm.containsKey(sum)){
        if(hm.get(sum)!=-1){
          tt=tt+dp[hm.get(sum)]+i-hm.get(sum)-1;
        }
        else{
          tt=tt+i-hm.get(sum)-1;
        }
      }
      else{
        tt+=i+1;
      }
    }
    hm.put(sum,i);
    dp[i]=tt;
    res+=tt;
  }
  return res;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(N)
