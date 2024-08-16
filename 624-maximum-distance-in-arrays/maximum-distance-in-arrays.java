class Solution
{
    public int maxDistance(List<List<Integer>> arrays)
    {
        int s= arrays.get(0).get(0);
        int b= arrays.get(0).get(arrays.get(0).size()-1);
        int sum=0;
        for (int i = 1; i < arrays.size(); i++)
        {
         sum=Math.max(sum,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-s));
         sum=Math.max(sum,Math.abs(b- arrays.get(i).get(0)));
         s=Math.min(s,arrays.get(i).get(0));
         b=Math.max(b,arrays.get(i).get(arrays.get(i).size()-1));
        }
        return sum;
    }
}