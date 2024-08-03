class Solution {
    public boolean isPalindrome(String s) {
       String t=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       StringBuilder sb=new StringBuilder(t);
       String pt=sb.reverse().toString();
       if(pt.equals(t))
       {
        return true;
       } 
        return false;
    }
}