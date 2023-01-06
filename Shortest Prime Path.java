class pair{
        String str;
        int level;
        pair(String s,int l){
            str=s;
            level=l;
        }
    }
class Solution
{
    int[] prime;
    Solution()
    {
        // Every index of prime stores zero or one
        // If prime[i] is zero means i is not a prime
        // If prime[i] is one means i is a prime
    }
    
     boolean isprime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    int method(String s,String dest,int[] vis){
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(s,0));
        while(!q.isEmpty()){
            pair temp=q.poll();
            vis[Integer.parseInt(temp.str)]=1;
            char s1[]=temp.str.toCharArray();
            int val=temp.level;
            if(temp.str.equals(dest)) return val;
            for(int i=0;i<4;i++){
                for(int d=0;d<=9;d++){
                    if(i==0 && d==0){
                        continue;
                    }
                  char a[]=s1;
                  char t=a[i];
                  a[i]=(char)(d+'0');
                  if(isprime(Integer.parseInt(String.valueOf(a))) && vis[Integer.parseInt(String.valueOf(a))]==0){
                      q.add(new pair(String.valueOf(a),val+1));
                      vis[Integer.parseInt(String.valueOf(a))]=1;
                  }
                  a[i]=t;
                }
            }
        }
        return -1;
    }

    public int shortestPath(int Num1,int Num2){
        String s=String.valueOf(Num1);
        String s1=String.valueOf(Num2);
        int vis[]= new int[10000];
        return method(s,s1,vis);
    }
}

//Time Complexity : O(nlogn)
//Space Complexity : O(n)
