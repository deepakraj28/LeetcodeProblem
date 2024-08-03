class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        System.arraycopy(nums1,0,arr,0,m);
        System.arraycopy(nums2,0,arr,m,n);
        Arrays.sort(arr);
        System.arraycopy(arr,0,nums1,0,m+n);
    }
}