class Solution
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> candy=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                candy.add(true);
            }
            else
            {
                candy.add(false);
            }
        }
        return candy;
    }
}