class Solution 
{
    public static ArrayList<Integer> makeBeautiful(int[] arr) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr)
        {
            if(list.size()!=0 && ((list.get(list.size()-1)<0 && i>=0)||(list.get(list.size()-1)>=0 && i<0)))
                list.remove(list.size()-1);
            else
                list.add(i);
        }
        return list;
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
