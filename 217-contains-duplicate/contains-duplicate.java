class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        Set<Integer> uniqueelement=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(uniqueelement.contains(nums[i]))
            {
                return true;
            }
            uniqueelement.add(nums[i]);
        }
        return false;
    }
}