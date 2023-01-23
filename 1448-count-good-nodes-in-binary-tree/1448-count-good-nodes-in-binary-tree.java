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
    public int goodNodes(TreeNode root) {
        return maximum(root,Integer.MIN_VALUE);
    }
    int count=0;
    public int maximum(TreeNode root,int value)
    {
        if(root==null)
        {
            return 0;
        }
        
        if(value<=root.val)
        {
            count++;
        }
        maximum(root.left,Math.max(value,root.val));
        maximum(root.right,Math.max(value,root.val));
        return count;
        
    }
}