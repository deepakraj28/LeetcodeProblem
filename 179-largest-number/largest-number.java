class Solution {
    public String largestNumber(int[] nums) {
        String s[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(s, (a, b) -> ((b + a).compareTo(a + b)));
        if (s[0].equals("0")) {
            return "0";
        }
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            t.append(s[i]);
        }
        return t.toString();
    }
}