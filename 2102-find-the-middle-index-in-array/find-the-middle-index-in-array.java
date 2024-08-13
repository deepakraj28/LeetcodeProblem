class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] presum=new int[n];
        presum[0]=0;
        for(int i=1;i<n;i++){
            presum[i]=presum[i-1]+nums[i-1];
        }

        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }

        for(int i=0;i<n;i++){
            if(presum[i]==totalsum-presum[i]-nums[i]){
                return i;
            }
        }
        return -1;
    }
}