/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        result.add(0,li);
       }
       return result; 
        
    }
}