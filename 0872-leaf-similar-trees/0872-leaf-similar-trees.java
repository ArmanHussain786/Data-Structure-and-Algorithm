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
    public void inorder(TreeNode root1, ArrayList<Integer> res)
    {
        if(root1==null)
        {
            return;
        }
        inorder(root1.left,res);
        if(root1.left==null && root1.right==null)
        {
            res.add(root1.val);
        }
        inorder(root1.right,res);
            
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root1==null || root2==null)
        {
            return false;
        }
        if(root1==null && root2==null)
        {
            return true;
        }
        inorder(root1,res);
        inorder(root2,ans);
        if(res.size()!=ans.size())
        {
            return false;
        }
        for(int i=0;i<res.size();i++)
        {
            if(res.get(i)!=ans.get(i))
            {
                return false;
            }
        }
        return true;
        
        
        
    }
}