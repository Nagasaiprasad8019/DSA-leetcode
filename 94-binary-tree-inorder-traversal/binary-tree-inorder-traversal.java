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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inorder=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode Node=root;
        while(true){
            if(Node!=null){
                stack.push(Node);
                Node=Node.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                Node= stack.pop();
               inorder.add(Node.val);
               Node=Node.right;
            }
        }
        return inorder;     
    }
}