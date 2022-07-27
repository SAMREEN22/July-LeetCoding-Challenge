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
  public void flatten(TreeNode root) {
    if(root==null) 
        return;
    TreeNode w=root;
    LinkedList<TreeNode> list=new LinkedList<>();
    while(true)
    {
      if(w.right!=null) 
          list.addLast(w.right);
      w.right=w.left;
      w.left=null;
      if(w.right==null && !list.isEmpty()) 
          w=w.right=list.pollLast();
      else if( (w=w.right)==null) 
          return;
    }
  }
}
