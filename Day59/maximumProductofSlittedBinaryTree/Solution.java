package Day59.maximumProductofSlittedBinaryTree;
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
    long tsum=0;
    long maxProduct=0;
   long totalSum(TreeNode root){
    if(root==null){
        return 0;
    }
    long leftsum=totalSum(root.left);
    long rightsum=totalSum(root.right);
   
    long sum=leftsum+rightsum+root.val;
    long s2=tsum-sum;
    maxProduct=Math.max(maxProduct,sum*s2);
    

    return sum;
   }
  
   
    public int maxProduct(TreeNode root) {
        if(root==null){
            return 0;
        }
        maxProduct=0;
        tsum=totalSum(root);
        totalSum(root);
        return (int)(maxProduct%1000000007);
    }
}