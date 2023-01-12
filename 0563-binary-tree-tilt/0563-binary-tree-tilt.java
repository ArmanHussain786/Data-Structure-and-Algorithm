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
    public int sum=0;
    public int findTilt(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        postorder(root);
        return sum;
        
    }
    public int postorder(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
       
        int left = postorder(root.left);
        
        int right = postorder(root.right);
        sum = sum + Math.abs(left-right);
        return left + right + root.val;
    }
}