/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        
        if(root==null)return null;
        
        boolean bl  = present(root.left,p) && present(root.left,q);
        boolean br  = present(root.right,p) && present(root.right,q);
        
        if(bl){
            return lowestCommonAncestor(root.left,p,q);
        }else if(br){
              return lowestCommonAncestor(root.right,p,q);

        }
        
        
        return root;
          
        
    }
    
    
    
    public static boolean present(TreeNode root,TreeNode p){
        
        if(root==null)return false;
        
        if(root==p)return true;
        
        return present(root.left,p) || present(root.right,p);
          
        
    }
    
    
}