class Solution {
    public int numberOfChild(int n, int k) {
        // Handle edge case where there is only one child
        if (n == 1) {
            return 0; // Only one child, they always have the ball
        }

        // Calculate effective seconds within the cycle
        int cycle = 2 * (n - 1);
        int effectiveK = k % cycle;

        // Determine the position of the ball after effectiveK seconds
        if (effectiveK <= n - 1) {
            return effectiveK; // Moving right
        } else {
            return cycle - effectiveK; // Moving left
        }
    }
}