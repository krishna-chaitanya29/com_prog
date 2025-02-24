/*
 * You are given an integer array nums of length n and an integer target. 
Your task is to find three integers in nums such that their sum is closest to the given target.

Return the sum of these three integers.

You may assume that each input would have exactly one solution.

Input Format:
-------------
Line-1: An integer n, the size of the array.
Line-2: n space-separated integers representing the elements of the array nums.
Line-3: A single integer target.

Output Format:
--------------
Line-1: Print a single integer, representing the sum of three integers closest to the target.

Sample Input-1:
---------------
4
-1 2 1 -4
1

Sample Output-1:
----------------
2

Sample Input-2:
---------------
3
0 0 0
1

Sample Output-2:
----------------
0


 */
public class CP_U1_AP17_Three_Sum_Closest {
    
}
import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumClosest {
    public static int closestThreeSum(int[] nums, int target) {
        Arrays.sort(nums); // Step 1: Sort the array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initial sum

        for (int i = 0; i < nums.length - 2; i++) { // Step 2: Fix one number
            int left = i + 1, right = nums.length - 1;

            while (left < right) { // Step 3: Use two pointers
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update closest sum if the new sum is closer
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++; // Increase sum
                } else if (currentSum > target) {
                    right--; // Decrease sum
                } else {
                    return target; // Exact match found
                }
            }
        }
        return closestSum; // Return the closest sum found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();

        System.out.println(closestThreeSum(nums, target));
    }
}
