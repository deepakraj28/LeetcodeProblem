class Solution {
    public int chalkReplacer(int[] chalk, int k) {
         long totalSum=0;
         for(int use:chalk){
            totalSum+=use;
         }
         k %= totalSum;
         for(int i=0;i<chalk.length;i++){
            if(k < chalk[i]){
                return i;
            }
            k -= chalk[i];
         }
return -1;

    }
}