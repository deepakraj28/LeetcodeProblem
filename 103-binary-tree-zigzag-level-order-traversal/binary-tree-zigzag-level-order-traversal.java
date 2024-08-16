class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
           return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean t=true;
        while(!q.isEmpty())
        {
            
            int qsize=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<qsize;i++)
            {
                
                TreeNode temp=q.poll(); 
                if(t==true)
                list.add(temp.val);
                else
                 list.addFirst(temp.val);
                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }
                if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
            }
            t=t==true?false:true;
            res.add(list);
        }
        return res;
    }
}