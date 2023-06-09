class Solution {
    public List<String> find_permutation(String S) {
        char temp[]=S.toCharArray();
        Arrays.sort(temp);
        S=new String(temp);
        ArrayList<String> al=new ArrayList<>();
        String ans="";
        help(S,ans,al);
        return al;
        
    }
    static void help(String str,String ans,ArrayList<String> al){
        if(str.length()==0){
            if(!al.contains(ans))al.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            help(newstr,ans+curr,al);
        }
    }
}

//Time Complexity : O(n! * n)
//Space Complexity : O(n! * n)
