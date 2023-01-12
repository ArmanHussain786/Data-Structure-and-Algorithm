/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isCousins(TreeNode* root, int x, int y) {
         if(!root)
        {
            return false;
        }
        
        if(root->val==x || root->val==y)
        {
            return false;
        }
        int parent =-1;
        int xHeight = findheightandparent(root,parent,x,0);
        
        int yparent =-1;
        int yHeight = findheightandparent(root,yparent,y,0);
        
        if(parent !=yparent && xHeight==yHeight)
        {
            return true;
        }
        return false;
    }
      int findheightandparent(TreeNode* root,int &parent,int value,int Height)
    {
       
       
        if(!root)
        {
            return 0;
        }
        int left=0;
        if(root->val==value)
        {
            return Height;
        }
        
        
          parent = root->val;
        left= findheightandparent(root->left,parent,value,Height+1);  
        
        
        
        if(left!=0)
        {
            return left;
        }
        parent =root->val;
        int right =findheightandparent(root->right,parent,value,Height+1);
        return right;
        
    }
};