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
       TreeNode ans1=null;
    public int ans(TreeNode root,TreeNode p ,TreeNode q)
    {
        if(root==null)    
        {
            return 0;
        }
        int left=ans(root.left,p,q);
        int right=ans(root.right,p,q);
        int self=0;
        if(root==p || root==q)
        {
            self=1;
        }
        int total=left+right+self;
        if(total==2 && ans1==null)
        {
            ans1=root;
        }
        return total;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ans(root,p,q);
        return ans1;
    }
}