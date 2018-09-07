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
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         if(root==null)
//             return new ArrayList<>();
//         else{
//             if(inorderTraversal(root.left)!=null)
//                 res.addAll(inorderTraversal(root.left));
//             res.add(root.val);
//             if(inorderTraversal(root.right)!=null)
//                 res.addAll(inorderTraversal(root.right));
//         } 
//         return res;
//     }

// }
import java.util.*;


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        printOne(root, result);

        return result;
    }

    private void printOne(TreeNode root,List<Integer> result){
        if(root != null){
            printOne(root.left, result);
            result.add(root.val);
            printOne(root.right, result);
        }
    }

    public List<Integer> inorderTraversal0(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.empty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
            
        }
        return list;
    }
}

