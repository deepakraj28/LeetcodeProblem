class Solution {
    public String countAndSay(int n) {
       if(n==1)
       {
        return "1";
       }
       String s=countAndSay(n-1);
       int a=0;
       StringBuilder t=new StringBuilder();
       for(int i=0;i<s.length();i++)
       {
        a++;
        if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1))
        {
            t.append(a).append(s.charAt(i));
            a=0;
        }
       }   
       return t.toString();
    }
}