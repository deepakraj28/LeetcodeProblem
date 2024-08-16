class Solution
{
    public List<List<Integer>> levelOrder(TreeNode root)
    {
    List<List<Integer>>  result=new ArrayList<>();
       if(root==null)
       {
          return result;
       }
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
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
        result.add(li);
       }
       return result; 
    }
}