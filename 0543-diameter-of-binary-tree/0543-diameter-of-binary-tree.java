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
    static int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        d = 0;
        
        height(root);
        
        return d-1;
        
    }
    
    public static int height(TreeNode root){
        
        if(root==null)return 0;
        
        int l = height(root.left);
        int r = height(root.right);
        
        int h = Math.max(l,r);
        
        d = Math.max(d,Math.max(h,l+r+1));
        
        return h+1;
        
        
    }
}