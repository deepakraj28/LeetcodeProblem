class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String s : arr) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        ArrayList<String> distinctList = new ArrayList<>();
        for (String s : arr) {
            if (countMap.get(s) == 1) {
                distinctList.add(s);
            }
        }
        if (k <= distinctList.size()) {
            return distinctList.get(k - 1);
        }
        return "";
    }
}
