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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        
        return bst(nums,0,nums.length-1);
        
    }
    
    
    public static TreeNode bst(int[] nums,int i,int j){
        
            if(j<i){
                  return null;
            }
        
        
            int mid = (j-i)/2 + i;
        
        
           TreeNode node = new TreeNode(nums[mid]);
        
            node.left = bst(nums,i,mid-1);
            node.right = bst(nums,mid+1,j);
                
            return node;
        
        
    }
}