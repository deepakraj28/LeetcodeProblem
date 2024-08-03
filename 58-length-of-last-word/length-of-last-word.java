class Solution {
    public int lengthOfLastWord(String s) {
      
      String[] arr=s.split(" "); 
      String tmp=arr[arr.length-1];
      return tmp.length();
    }
}