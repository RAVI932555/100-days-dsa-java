package Day49.BinaryTreeRightSizeView;

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
    static class Info{
        int vh;
        TreeNode node;
        public Info(int vh,TreeNode node){
            this.vh=vh;
            this.node=node;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        q.add(new Info(0,root));
        q.add(null);
        int max=0;
    
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.vh)){
                    map.put(curr.vh,curr.node);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.vh+1,curr.node.right));
                    max=Math.max(max,curr.vh+1);
                }
                if(curr.node.left!=null){
                    q.add(new Info(curr.vh+1,curr.node.left));
                    max=Math.max(max,curr.vh+1);
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=max;i++){
            list.add(map.get(i).val);
        }
        return list;
    }
}