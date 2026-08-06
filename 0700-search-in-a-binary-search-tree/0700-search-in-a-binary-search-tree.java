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
    TreeNode ans1=null;
    public TreeNode ans(TreeNode node,int val)
    {
        if(node==null)
        {
            return node;
        }
        if(node.val==val && ans1==null)
        {
            System.out.print(node.val);
            ans1=node;
            return node;
        }
        else if(node.val>val)
        {
            ans(node.left,val);
        }
        else if(node.val<val)
        {
            ans(node.right,val);
        }
        return null;
    }
    public TreeNode searchBST(TreeNode root, int val) 
    {
        ans(root,val);
        return ans1;
    }
}