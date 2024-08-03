class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]!=nums[i-1])
            {
              c++;
            }
            if(c==2)
            {
                return nums[i-1];
            }
        }
        
        return nums[nums.length-1];
    }
}