class Solution
{
    public long maxAlternatingSum(int[] nums)
    {
        long sum = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum+=Math.max(nums[i]-nums[i-1],0);
        }
        return sum;
    }
}