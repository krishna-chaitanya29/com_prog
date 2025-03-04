/*
 * You are given an m x n grid where each cell can have one of three values:
-> 0 representing an empty cell,
-> 1 representing a fresh orange, or
-> 2 representing a rotten orange.

Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. 
If this is impossible, return -1.


Input Format:
-------------
Line-1: Two integers, m and n, represents grid[] sizes
Line-2 to m: n Space separated integers, represents grid[i][j]

Output Format:
--------------
Line-1: An integer

Sample Input-1:
---------------
3 3
2 1 1
1 1 0
0 1 1

Sample Output-1:
----------------
4

Sample Input-2:
---------------
3 3
2 1 1
0 1 1
1 0 1

Sample Output-2:
----------------
-1

Explanation: 
-------------
The orange in the bottom left corner (row 2, column 0) is never rotten, 
because rotting only happens 4-directionally.

Sample Input-3:
---------------
1 1
0 2

Sample Output-3:
----------------
0

Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
 
Constraints:
------------
m == grid.length
n == grid[i].length
1 <= m, n <= 10
grid[i][j] is 0, 1, or 2.
 */
package cp_u3;

public class FS_AP9_Rotten_Oranges {
    
}
import java.util.*;
class RottingOranges{
    public static int getMinTime(int[][] grid , int r , int c){
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2) q.add(new int[]{i,j});
                else if(grid[i][j]==1) fresh++;
            }
        }
        if (fresh == 0) return 0;
        
        int min = 0;
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        while(!q.isEmpty()){
            int size = q.size();
            boolean rotted = false;
            
            for(int i=0;i<size;i++){
                int[] pos = q.poll();
                int row = pos[0];int col = pos[1];
                
                for(int[] d:dir){
                    int nr = row + d[0];
                    int nc = col + d[1];
                    
                    if(nr >= 0 && nr < r && nc >= 0 && nc < c && grid[nr][nc]==1 ){
                        grid[nr][nc] = 2;
                        q.add(new int[]{nr,nc});
                        fresh--;
                        rotted = true;
                    }
            
        }
        
    }
    if(rotted) min++;
    
 }
 

return fresh == 0 ? min:-1;

}
    
    
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); int c = sc.nextInt();
        int[][] grid = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(getMinTime(grid , r , c));
    }
}