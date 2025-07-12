import java.util.Stack;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int maxSize = 0;
        for(int x = 0; x < grid.length ;x++){
            for(int y = 0; y < grid[0].length; y++){
                if(grid[x][y] == 0) continue;



                Stack<int[]> stack = new Stack<>();
                grid[x][y] = 0;
                stack.push(new int[]{x,y});
                int size = 0;
                while (!stack.isEmpty()){
                    size ++;
                    int[] now = stack.pop();
                    int [][] nexts = {
                            {now[0]+1,now[1]},
                            {now[0],now[1]+1},
                            {now[0]-1,now[1]},
                            {now[0],now[1]-1}
                    };
                    for(int[] next : nexts){
                        if(isVaild(next,grid) && grid[next[0]][next[1]] == 1){
                            grid[next[0]][next[1]] = 0;
                            stack.push(next);
                        }
                    }
                }
                maxSize = Math.max(size,maxSize);
            }
        }
        return maxSize;
    }
    //void dfs()

    boolean isVaild(int[] next,int[][] grid){
        return 0 <= next[0] && next[0] < grid.length
                && 0 <= next[1] && next[1] < grid[0].length;
    }
}