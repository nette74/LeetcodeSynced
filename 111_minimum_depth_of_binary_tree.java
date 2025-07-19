import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int minDepth(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Queue<Integer> depthQueue = new LinkedList<>();
        depthQueue.add(0);

        while (!queue.isEmpty() && !depthQueue.isEmpty()){
            TreeNode now = queue.poll();
            
            int depth = depthQueue.poll();
            if(now == null) continue;
            if(now.right == null && now.left == null) return depth+1;

            if(now.left != null) {
                queue.add(now.left);
                depthQueue.add(depth+1);
            }
            if(now.right != null){
                queue.add(now.right);
                depthQueue.add(depth+1);
            }
        }
        return 0;
    }
}