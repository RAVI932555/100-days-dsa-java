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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q || root==null) {
            return root;
        }

        TreeNode leftA=lowestCommonAncestor(root.left,p,q);
        TreeNode rightA=lowestCommonAncestor(root.right,p,q);

        if(leftA==null){
            return rightA;
        }
        if(rightA==null){
            return leftA;
        }
        return root;
    }
}