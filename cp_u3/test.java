package cp_u3;

import java.util.Scanner;

class FenwickTree {
    int[] BIT; // Binary Indexed Tree
    int n;     // Size of the array

    public FenwickTree(int[] nums) {
        n = nums.length;
        BIT = new int[n + 1]; // BIT uses 1-based index
        for (int i = 0; i < n; i++) {
            System.out.println("Initializing: pos = " + (i + 1) + ", value = " + nums[i]);
            update(i + 1, nums[i]);
        }
    }

    // Update function (add value at index i)
    public void update(int i, int val) {
        System.out.println("Updating: index = " + i + ", value = " + val);
        while (i <= n) {
            BIT[i] += val;
            System.out.println(" BIT pos = " + i + ", BIT value = " + BIT[i]);
            i += (i & -i); // Move to next index
            System.out.println(" Next index = " + i);
        }
    }

    // Get sum from 1 to i
    public int sum(int i) {
        int sum = 0;
        System.out.println("Calculating sum up to index = " + i);
        while (i > 0) {
            sum += BIT[i];
            System.out.println(" Current sum = " + sum + ", BIT pos = " + i + ", BIT value = " + BIT[i]);
            i -= (i & -i); // Move to parent node
            System.out.println(" Next index = " + i);
        }
        return sum;
    }

    // Get range sum from l to r
    public int sumRange(int l, int r) {
        System.out.println("Calculating range sum from " + l + " to " + r);
        return sum(r) - sum(l - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int queries = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        FenwickTree ft = new FenwickTree(nums);

        while (queries-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.println("Query: sumRange(" + l + ", " + r + ")");
                System.out.println("Result: " + ft.sumRange(l, r));
            } else {
                int index = sc.nextInt();
                int value = sc.nextInt();
                System.out.println("Query: update(" + (index + 1) + ", " + value + ")");
                ft.update(index + 1, value);
            }
        }
    }
}


