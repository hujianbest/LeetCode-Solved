/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         printOne(root, result);
//         return result;
//     }

//     private void printOne(TreeNode root,List<Integer> result){
//         if(root != null){
//             result.add(root.val);
//             printOne(root.left, result);
//             printOne(root.right, result);
//         }
//     }
// }

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null){
            result.add(root.val);
            if(root.right != null){
                stack.push(root.right);
            }
            root = root.left;
            if(root == null && !stack.isEmpty()){
                root = stack.pop();
            }
        }
        return result;
    }
}