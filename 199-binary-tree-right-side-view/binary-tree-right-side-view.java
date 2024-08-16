import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty())
        {
            int qs = q.size();
            for (int i = 0; i < qs; i++)
            {
                TreeNode temp = q.poll();
                if (i == qs - 1)
                {
                    result.add(temp.val);
                }
                if (temp.left != null)
                {
                    q.offer(temp.left);
                }
                if (temp.right != null)
                {
                    q.offer(temp.right);
                }
            }
        }
        return result;
    }
}
