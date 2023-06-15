class Solution{
    static String longestPalin(String s){
        int n = s.length();
        int mx = 0;
        int end = 0;
        int start = 0; 
        for(int i = 0; i<n;i++){
            int l = i;
            int r = i;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            r--;
            l++;
            int k = r-l+1;
            if(k>mx){
                mx = k;
                end = r;
                start = l;
            }
        }
         for(int i = 0; i<n;i++){
            int l = i-1;
            int r = i;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            r--;
            l++;
            int k = r-l+1;
            if(k>mx){
                mx = k;
                end = r;
                start = l;
            }
        }
        String ans = "";
        for(int i = start; i<=end; i++)ans += s.charAt(i);
        return ans ;
        
    }
}

//Time Complexity : O(N*N)
//Space Complexity : O(1)
