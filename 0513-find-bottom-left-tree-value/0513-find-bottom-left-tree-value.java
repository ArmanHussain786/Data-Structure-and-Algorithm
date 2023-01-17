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
    int ans,h=0;
    public int findBottomLeftValue(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
         checker(root,1);
        return ans;
        
    }
    public void checker(TreeNode root,int depth)
    {
        if(depth>h)
        {
            ans=root.val;
            h=depth;
        }
        if(root.left!=null)
            checker(root.left,depth+1);
        if(root.right!=null)
            checker(root.right,depth+1);
    
    }
}