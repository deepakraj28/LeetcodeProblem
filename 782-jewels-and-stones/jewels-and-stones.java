class Solution
{
    public int numJewelsInStones(String jewels, String stones)
    {
        char[] cj=jewels.toCharArray();
        int[] r=new int[cj.length];
        for(int i=0;i<cj.length;i++)
        {
            int count=0;
            for(int j=0;j<stones.length();j++)
            {
                if(cj[i]==stones.charAt(j))
                {
                    count++;
                }
            }
            r[i]=count;
        }
        int sum=0;
        for(int i=0;i<r.length;i++)
        {
            sum+=r[i];
        }    
        return sum;
    }
}