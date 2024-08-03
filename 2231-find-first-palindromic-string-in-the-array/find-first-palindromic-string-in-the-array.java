class Solution {
    public String firstPalindrome(String[] words) {
       int s=words.length;
       String str="";
       for(int i=0;i<s;i++)
       {
           String temp=words[i];
           StringBuffer sb=new StringBuffer(temp);
           String revstr=sb.reverse().toString();
           if(temp.equals(revstr))
           {
             str=temp;
             break;
           }
       } 
       return str;
    }
}