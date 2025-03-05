/*
 * Malika taught a new fun time program practice for Engineering Students.
As a part of this she has given set of N numbers, and asked the students 
to perform the operations listed below:
1. sumRange(start, end) - return the sum of numbers between the indices start and end, both are inclusive.
2. update(ind, val) - update the value at the index 'ind' to 'val'.

Your task is to solve this problem using Segment Tree concept.

Input Format:
-------------
Line-1: Two integers N and Q, size of the array(set of numbers) and query count.
Line-2: N space separated integers.
next Q lines: Three integers option, start/ind and end/val.

Output Format:
--------------
An integer result, for every sumRange query.


Sample Input:
-------------
5 5
4 2 13 3 25
1 0 4		//sumRange
1 1 3		//sumRange
2 2 18	//update
2 4 17	//update
1 0 4		//sumRange

5 5
4 2 13 3 25
1 0 4
1 1 3
2 2 18	
2 4 17
1 0 4	

Sample Output:
--------------
47
18
44

 */


package cp_u3;

public class CP_U3_SP2_Segement_Tree {
    
}
import java.util.Scanner;

class SegmentTreeNode {
    int start, end, sum;
    SegmentTreeNode left, right;

    public SegmentTreeNode(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
        this.left = null;
        this.right = null;
    }
}

class SegmentTree {
    private SegmentTreeNode root;

    public SegmentTree(int[] arr) {
        root = buildTree(arr, 0, arr.length - 1);
    }

    private SegmentTreeNode buildTree(int[] arr, int start, int end) {
        if (start > end) return null;

        SegmentTreeNode node = new SegmentTreeNode(start, end);

        if (start == end) {  // Leaf node
            node.sum = arr[start];
        } else {
            int mid = (start + end) / 2;
            node.left = buildTree(arr, start, mid);
            node.right = buildTree(arr, mid + 1, end);

            // Internal node sum is the sum of left and right children
            node.sum = node.left.sum + node.right.sum;
        }
        return node;
    }

    public int sumRange(int left, int right) {
        return sumRangeUtil(root, left, right);
    }

    private int sumRangeUtil(SegmentTreeNode node, int left, int right) {
        if (node == null || right < node.start || left > node.end) {
            return 0;  // No overlap
        }
        if (left <= node.start && node.end <= right) {
            return node.sum;  // Complete overlap
        }

        // Partial overlap, check both left and right children
        return sumRangeUtil(node.left, left, right) + sumRangeUtil(node.right, left, right);
    }

    public void update(int index, int value) {
        updateUtil(root, index, value);
    }

    private void updateUtil(SegmentTreeNode node, int index, int value) {
        if (node.start == node.end) {  // Leaf node
            node.sum = value;
            return;
        }

        int mid = (node.start + node.end) / 2;
        if (index <= mid) {
            updateUtil(node.left, index, value);
        } else {
            updateUtil(node.right, index, value);
        }

        // Update the sum of the parent node after updating child
        node.sum = node.left.sum + node.right.sum;
    }
}

public class SegmentTreeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SegmentTree segTree = new SegmentTree(arr);

        while (q-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                System.out.println(segTree.sumRange(start, end));
            } else if (type == 2) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                segTree.update(index, value);
            }
        }
        sc.close();
    }
}
