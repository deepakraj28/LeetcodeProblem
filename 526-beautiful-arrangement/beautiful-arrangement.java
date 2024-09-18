class Solution {
    int ans=0;
    public int countArrangement(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        perm(list,n,1);
        return ans;
    }

    public void perm(ArrayList<Integer> list, int n, int index){
        if(list.size()==n){
            ans++;
            return;
        }

        for(int i=1;i<=n;i++){
            if(list.contains(i))
                continue;

            if(i%index==0 || index%i==0){
                list.add(i);
                perm(list,n,index+1);
                list.remove(list.size()-1);
            }
        }
    }
}