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
    public boolean isBalanced(TreeNode root) {
        
        balance = true;
        
        height(root);
        
        return balance;
           
        
    }
    static boolean balance = true;
    
    public static int height(TreeNode root){
           
           if(root==null || balance==false)return 0;
        
           int l  = height(root.left);
           int r  = height(root.right);
        
           int g = Math.abs(l-r);
           if(g>1)balance = false;
          
        
        return Math.max(l,r)+1;
        
        
    }
    
}