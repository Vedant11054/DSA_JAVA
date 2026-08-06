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
    public int ans(TreeNode node,TreeNode p, TreeNode q)
    {
        if(node==null)
        {
            return 0;
        }
        int left=ans(node.left,p,q);
        int right=ans(node.right,p,q);
        int self=0;
        if(node==p || node==q)
        {
            self=1;
        }
        int total=self+left+right;
        if(total==2 && ans1==null)
        {
            ans1=node;
        }
        return total;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        ans(root,p,q);
        return ans1;
    }
}