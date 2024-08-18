class Solution
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
       Map<String,List<String>> res=new HashMap<>();
       for(int i=0;i<strs.length;i++)
       {
        char[] ch=strs[i].toCharArray();
        Arrays.sort(ch);
        String str=new String(ch);
        if(!res.containsKey(str))
        {
            res.put(str,new ArrayList<>());
        }
        res.get(str).add(strs[i]);
       }
       return new ArrayList<>(res.values());
    }
}