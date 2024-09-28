class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> copy=new HashSet<>();
        Set<Integer> common=new HashSet<>();
        for(int val:nums1)
        {
            copy.add(val);
        }
        for(int val:nums2)
        {
           if(copy.contains(val))
           {
            common.add(val);
           }
        }
        int[] res=new int[common.size()];
        int i=0;
        for(int value:common)
        {
            res[i++]=value;
        }
        return res;
    }
}