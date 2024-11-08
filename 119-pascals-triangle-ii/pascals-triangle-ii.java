class Solution {
    public List<Integer> getRow(int row) {
        List<Integer> ansRow = new ArrayList();
        ansRow.add(1);
        long res=1;
        for (int i = 1; i < row+1; i++) {
            res = res * (row+1 - i);
            res = res / i;
            ansRow.add((int)res);
        }
        return ansRow;
    }
}