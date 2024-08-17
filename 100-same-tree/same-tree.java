class Solution
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(p==null&&q==null)
        {
           return true;
        }
        if(p!=null&&q==null)
        {
            return false;
        }
        if(q!=null&&p==null)
        {
            return false;
        }
        if (p.val!=q.val)
        {
            return false;
        } 
        else if(p.left==null&&q.left!=null)
        {
            return false;
        }    
        else if(p.left!=null&&q.left==null)
        {
            return false;
        }
        else if(p.right==null&&q.right!=null)
        {
            return false;
        }
        else if(p.right!=null&&q.right==null)
        {
            return false;
        }
        boolean left=true;
        boolean right=true;
        if (p.left!=null&&q.left!=null)
        {
            left=isSameTree(p.left,q.left);
        }
        if (p.right!=null&&q.right!=null)
        {
            right=isSameTree(p.right,q.right);
        }
        return left && right;
    }
}