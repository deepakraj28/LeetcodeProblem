class Solution
{
    public int kthSmallest(TreeNode root, int k)
    {
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       List<Integer> li=new ArrayList<>();
       while(!q.isEmpty())
       {
        int qs=q.size();
        for(int i=0;i<qs;i++)
        {
            TreeNode temp=q.poll();
            li.add(temp.val);
            if(temp.left!=null)
            {
               q.offer(temp.left); 
            }
             if(temp.right!=null)
            {
               q.offer(temp.right); 
            }
        }
       } 
       Collections.sort(li);
       return li.get(k-1); 
    }
}