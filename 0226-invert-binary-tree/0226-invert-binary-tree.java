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
    public TreeNode invertTree(TreeNode root) {
        
          if(root==null)return null;
        
        
         TreeNode t1 = invertTree(root.left);
         TreeNode t2 = invertTree(root.right);
        
        root.left = t2;
        root.right = t1;
        
        
        return root;

        
        
    }
}