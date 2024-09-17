class Solution 
{
    public String[] uncommonFromSentences(String s1, String s2) 
    {
       String str1[]=s1.split(" ");
       String str2[]=s2.split(" ");
       HashMap<String,Integer> map=new HashMap<>();
       for(int i=0;i<str1.length;i++)
       {
         map.put(str1[i],map.getOrDefault(str1[i],0) +1);
       }
       for(int i=0;i<str2.length;i++)
       {
         map.put(str2[i],map.getOrDefault(str2[i],0) +1);
       }
       ArrayList<String> arr=new ArrayList<>(); 
       for(String itr: map.keySet())
       {
        if(map.get(itr)==1)
        {
            arr.add(itr);
        }
       }
       String[] res=arr.toArray(new String[arr.size()]);
       return res;
    }
}