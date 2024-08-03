class Solution {
    public void rotate(int[] nums, int k)
    {
        k%=nums.length;
        result(nums,0,nums.length-1);
        result(nums,0,k-1);
        result(nums,k,nums.length-1);
    }
    public void result(int[] nums,int s,int e)
    {
        while(s<e)
        {
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}