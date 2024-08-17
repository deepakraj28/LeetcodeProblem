class Solution
{
    public int maxDepth(TreeNode root)
    {

      if(root==null)
       {
          return 0;
       }
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       int c=0;
       while(!q.isEmpty())
       {
        int qs=q.size();
        List<Integer> li=new ArrayList<>();
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
        c++;
    }return c;
}
}