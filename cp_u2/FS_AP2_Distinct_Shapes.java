/*
 * Viraj Aanand is a wedding planner, He ordered his assistant to decorate a wall.
The decorator plans to decorate the wall with two different colored balloons.
The wall size is M*N, The decorator can decorate the wall using M*N balloons
the balloons are blue or white in color.

Blue colored ballons represented with digit-1 and 
White colored ballons represented with digit-0.

The blue colored balloons forms different shapes, that are connected 4 directonally.
The directons are upwards, downwards, left, and right. Viraj Aanand got an idea to 
count the unique shapes formed by blue colored ballons.

You will be given the decorated wall as a matrix wall[][].
Your task is to help, Viraj Aanand to count the unique shapes.

Input Format:
-------------
Line-1: Two space separated integers M and N, size of the wall.
Next M lines: N space separated integers, either 0 or 1.

Output Format:
--------------
Print an integer, Number of distinct shapes formed by blue balloons.


Sample Input-1:
---------------
4 5
1 1 0 0 0
1 1 0 0 0
0 0 0 1 1
0 0 0 1 1

Sample Output-1:
----------------
1


Sample Input-2:
---------------
5 5
1 1 0 1 1
1 0 0 0 1
0 0 0 0 0
1 0 0 0 1
1 1 0 1 1

Sample Output-2:
----------------
4

 */

import java.util.*;


public class FS_AP2_Distinct_Shapes {
    public static void dfs(int[][] grid , boolean[][] v , int br , int bc , int i , int j , List<String> list){
        if(i<0 || j<0 || i>=grid.length || j>=grid.length || v[i][j] || grid[i][j]==0 ) return;
        v[i][j] = true;
        list.add((i-br)+":"+(j-bc));
        dfs(grid , v,br,bc,i+1,j,list);
        dfs(grid , v,br,bc,i-1,j,list);
        dfs(grid , v,br,bc,i,j+1,list);
        dfs(grid , v,br,bc,i,j-1,list);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] grid = new int[r][c];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        boolean[][] v = new boolean[r][c];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1 && !v[i][j]){
                    List<String> list = new ArrayList<>();
                    dfs(grid,v,i,j,i,j,list);
                    set.add(String.join(",", list));
                }
            }
        }
    }
}
