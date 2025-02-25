/*
 * Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.

Input Format:
-------------
Line-1: An integer N
Line-2: N space seperated integers

Output Format:
--------------
Line-1: A list of integers

Sample Input-1:
---------------
5
-4 -1 0 3 10

Sample Output-1: 
----------------
[0, 1, 9, 16, 100]


 */


public class CP_U2_AP29_SquaresOfSortedArray {
    
}
import java.util.*;
class squares {
    public static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int left = 0, right = n - 1;
        int i = n - 1; 
        while (left <= right) {
            int lval = arr[left] * arr[left];
            int rval = arr[right] * arr[right];
            if (lval > rval) {
                res[i] = lval;
                left++;
            } 
            else {
                res[i] = rval;
                right--;
                }
            i--; 
            }
        
        return res;}

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
        int[] sort = sortedSquares(arr);
        System.out.println(Arrays.toString(sort));
        }

}