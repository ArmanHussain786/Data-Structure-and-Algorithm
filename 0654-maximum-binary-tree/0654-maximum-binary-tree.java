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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n=nums.length;
        return buildTree(nums,0,n-1);
    }
    public TreeNode buildTree(int []nums,int start,int end)
    {
       
        if(start>end)
        {
            return null;
        }
        int maxindex=start;
        for(int i=start;i<=end;i++)
        {
            if(nums[i]>nums[maxindex])
                maxindex=i;
        }
         
        TreeNode ans = new TreeNode(nums[maxindex]);
        ans.left=buildTree(nums,start,maxindex-1);
        ans.right=buildTree(nums,maxindex+1,end);
        
        return ans;
    }
}