class Solution
{
    public int[] getConcatenation(int[] nums)
    {
        int n=nums.length;
        int[] res=new int[n+n];
        int i=0;
        for(i=0;i<n;i++)
        {
           res[i]=nums[i];
        }
        int k=0;
        for(int j=i;j<res.length;j++)
        {
            res[j]=nums[k];
            k++;
        }
        return res;
    }
}