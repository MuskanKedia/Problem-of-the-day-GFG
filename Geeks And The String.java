class Solution 
{
    public static String removePair(String s) 
    {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else if(stack.peek()==s.charAt(i))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        if(stack.isEmpty())
            return "-1";
        String ans="";
        while(!stack.isEmpty())
            ans=stack.pop()+ans;
        return ans;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(N)
