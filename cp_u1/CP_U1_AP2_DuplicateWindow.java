/*
 * \Given an integer array of nums and an integer window size X, 
return true if there are duplicate values (nums[i]== nums[j])in that Window(X)
X size is always <= abs(i - j) where i and j are two distinct indices of array.

Input Format:
-------------
Line-1: An integer N, Array Size
Line-2: Space separated integers, array elements
Line-3: An integer X, window size

Output Format:
--------------
Line-1: Booelan value, true/false


Sample Input-1:
---------------
4
1 2 3 1  
3 

Sample Output-1: 
----------------
false

Sample Input-2:
---------------
6
1 2 3 3 2 3
2

Sample Output-2: 
----------------
true
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CP_U1_AP2_DuplicateWindow {
    public static boolean moveOn(int[] arr, List<Integer> list, Set<Integer> set, int k) {
        for (int i = k; i < arr.length; i++) {
            set.clear();
            list.remove(0);
            list.add(arr[i]);
            for (int num : list) {
                set.add(num);
            }
            if (set.size() != k) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            list.add(arr[i]);
        }
        for (int num : list) {
            set.add(num);
        }
        boolean result = false;
        if (set.size() != k) {
            result = true;
        } else {
            result = moveOn(arr, list, set, k);
        }
        System.out.println(result);
    }
}
