class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
    {
       int max=0;
       int res=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==1)
        {
            res++;
        }
        if(nums[i]!=1)
        {
            if(max<res)
            {
                max=res;
            }
            res=0;
        }
       } 
        if(max<res)
            {
                max=res;
            }
       return max;
    }
}