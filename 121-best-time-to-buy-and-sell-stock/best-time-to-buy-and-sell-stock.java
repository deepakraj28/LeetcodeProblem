class Solution {
    public int maxProfit(int[] arr) {
        int max=0;
        int n=arr.length;
        int i;
        int profit=0;int min=arr[0];
        for(i=0;i<=n-1;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }profit=arr[i]-min;
            if(max<profit)
            {
                max=profit;
            }
        }
        return max;
    }
}