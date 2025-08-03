import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {


        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null)
            queue.add(root);
        else
            return false;


        while(!queue.isEmpty()){
            TreeNode now =  queue.poll();

            System.out.println(now.val);

            if(now.left == null && now.right == null){
                if(targetSum == now.val) return true;
            }
            if(now.left != null){
                now.left.val += now.val;
                queue.add(now.left);
            }
            if(now.right != null){
                now.right.val += now.val;
                queue.add(now.right);
            }
            
            
            
        }
        return false;
    }

}