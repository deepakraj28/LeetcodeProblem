class Solution {
    public boolean isHappy(int n) {
        if (n == 1 ||n==7) {
            return true;
        }
        while (n > 9) {
            int res = 0;
            while (n > 0) {
                int rem = n % 10;
                res += rem * rem;
                n /= 10;
            }
            n = res;
            if (n == 1 ||n==7 ) {
                return true;
            }
         
        }
        return n == 1||n==7;
    }
}