/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        postorder(root,res);
        return res;
    }
    public void postorder(Node root,ArrayList<Integer> res)
    {
        for(int i=0;i<root.children.size();i++)
        {
            postorder(root.children.get(i),res);
        }
        res.add(root.val);
    }
}