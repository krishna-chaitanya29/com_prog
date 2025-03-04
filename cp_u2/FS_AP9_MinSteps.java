/*
 * Given a positive integer n, you can apply one of the following operations:

If n is even, replace n with n / 2.
If n is odd, replace n with either n + 1 or n-1 .
Return the minimum number of operations needed for n to become 1.

Sample Input-1:
---------------
8


Sample Output-1: 
----------------
3

Explanation: 8 -> 4 -> 2 -> 1

Sample Input-2:
---------------
7

Sample Output-2: 
----------------
4

Explanation: 7 -> 8 -> 4 -> 2 -> 1
or 7 -> 6 -> 3 -> 2 -> 1

 */


public class FS_AP9_MinSteps {
    
}

// MinStepcal(n);

// Base case: if n is 1, no operations needed.

// Even case: divide by 2.

// Odd case: choose the minimum steps.

// Store result to avoid redundant calculations.
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

class MinStepsBFS {
    public static int MinStepcal(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(n);
        visited.add(n);
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int num = queue.poll();
                if (num == 1) return steps;

                if (num % 2 == 0) {
                    if (!visited.contains(num / 2)) {
                        queue.add(num / 2);
                        visited.add(num / 2);
                    }
                } else {
                    if (!visited.contains(num + 1)) {
                        queue.add(num + 1);
                        visited.add(num + 1);
                    }
                    if (!visited.contains(num - 1)) {
                        queue.add(num - 1);
                        visited.add(num - 1);
                    }
                }
            }
            steps++;
        }
        return -1; // Should never reach here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(MinStepcal(n));
        sc.close();
    }
}
