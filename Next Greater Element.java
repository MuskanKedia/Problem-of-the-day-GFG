class Solution
{
    public static long[] nextLargerElement(long[] arr, int n) 
    { 
        long[] res=new long[n];
        Stack<Long> stack=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[i]>stack.peek())
                stack.pop();
            if(stack.isEmpty())
                res[i]=-1;
            else
                res[i]=stack.peek();
            stack.push(arr[i]);
        }
        return res;
    } 
}

//Time Complexity : O(N)
//Space Complexity : O(N)
