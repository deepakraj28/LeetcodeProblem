class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a1 = s1.split(" ");
        String[] a2 = s2.split(" ");
        String[] newArr = new String[a1.length + a2.length];
        ArrayList<String> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < a1.length; i++) {
            newArr[i] = a1[i];
        }
        for (int i = a1.length; i < newArr.length; i++) {
            newArr[i] = a2[j];
            j++;
        }
        for (int i = 0; i < newArr.length; i++) {
            if (map.containsKey(newArr[i])) {
                map.put(newArr[i], map.get(newArr[i]) + 1);
            } else {
                map.put(newArr[i], 1);
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                result.add(key);
            }
        }
        return result.toArray(new String[0]);
    }
}