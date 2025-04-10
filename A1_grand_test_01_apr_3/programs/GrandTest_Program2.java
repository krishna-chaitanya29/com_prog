package A1_grand_test_01_apr_3.programs;

public class GrandTest_Program2 {
    
}
/*
 * import java.util.*;

public class ClosestKBookPrices {

    static class TreapNode {
        int val, priority;
        TreapNode left, right;

        TreapNode(int val) {
            this.val = val;
            this.priority = new Random().nextInt();
        }
    }

    static class Treap {
        TreapNode root;

        void insert(int val) {
            root = insert(root, new TreapNode(val));
        }

        private TreapNode insert(TreapNode root, TreapNode node) {
            if (root == null) return node;
            if (node.val < root.val) {
                root.left = insert(root.left, node);
                if (root.left.priority > root.priority)
                    root = rotateRight(root);
            } else {
                root.right = insert(root.right, node);
                if (root.right.priority > root.priority)
                    root = rotateLeft(root);
            }
            return root;
        }

        private TreapNode rotateRight(TreapNode y) {
            TreapNode x = y.left;
            y.left = x.right;
            x.right = y;
            return x;
        }

        private TreapNode rotateLeft(TreapNode x) {
            TreapNode y = x.right;
            x.right = y.left;
            y.left = x;
            return y;
        }

        void inorder(TreapNode node, List<Integer> result) {
            if (node == null) return;
            inorder(node.left, result);
            result.add(node.val);
            inorder(node.right, result);
        }
    }

    //Any supporting functions write here

    // Get K closest books
    public static List<Integer> getClosestK(List<Integer> sorted, double target, int k) {
        //Write your code here and return the list
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // number of books
        Treap treap = new Treap();
        for (int i = 0; i < N; i++) {
            treap.insert(sc.nextInt());
        }

        double target = sc.nextDouble(); //the target price
        int k = sc.nextInt(); //number of closest book prices to return

        List<Integer> sorted = new ArrayList<>();
        treap.inorder(treap.root, sorted);

        List<Integer> closest = getClosestK(sorted, target, k);
        for (int val : closest) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
 */