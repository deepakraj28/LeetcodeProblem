class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int[] count = new int[divisors.length];
        int maxCount = 0;     
        for (int num : nums) {
            for (int i = 0; i < divisors.length; i++) {
                if (num % divisors[i] == 0) {
                    count[i]++;
                    if (count[i] > maxCount) {
                        maxCount = count[i];
                    }
                }
            }
        }  
        int minDivisor = Integer.MAX_VALUE; 
        for (int i = 0; i < divisors.length; i++) {
            if (count[i] == maxCount && divisors[i] < minDivisor) {
                minDivisor = divisors[i];
            }
        }
        return minDivisor;
    }
}