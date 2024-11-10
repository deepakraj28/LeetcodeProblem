class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        if(pattern.length()!=str.length)
        {
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char sch = pattern.charAt(i);
            String tch =str[i];
            if(map.containsKey(sch)){
                if(!map.get(sch).equals(tch)){
                    return false;
                }
            }
            else if(map.containsValue(tch)){
                return false;
            }
            else {
                map.put(sch,tch);
            }
        }
        return true;
    }
}