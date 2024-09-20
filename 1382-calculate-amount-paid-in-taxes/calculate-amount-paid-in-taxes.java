class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double result = 0;
        for (int i = 0; i < brackets.length; i++) {
            int[] group = brackets[i];
            int prevUpper = 0;
            if (i > 0) {
                prevUpper = brackets[i - 1][0];
            }
            int upper = group[0], percent = group[1];
            int sumToTax = upper - prevUpper;
            if (income - sumToTax >= 0) {
                income -= sumToTax;
                result += ((sumToTax * percent) / 100.0);
            } else {
                result += ((income * percent) / 100.0);
                break;
            }
        }
        return result;
    }
}