import java.util.*;
class TreeNode 
{
    int val;
    TreeNode left, right;
    TreeNode(int val) 
{
        this.val = val;
        this.left = this.right = null;
}
}
public class main 
{
    private static Map<Integer, Integer> inOrderIndexMap;
    private static int preIndex;
    public static TreeNode ct(int[] inorder, int[] preorder, int n) 
{
        inOrderIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) 
{
            inOrderIndexMap.put(inorder[i], i);
}
        preIndex = 0;
        return buildTree(inorder, preorder, 0, n - 1);
}
    private static TreeNode buildTree(int[] inorder, int[] preorder, int inStart, int inEnd) 
{
        if (inStart > inEnd) return null;
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int inIndex = inOrderIndexMap.get(rootVal);
        root.left = buildTree(inorder, preorder, inStart, inIndex - 1);
        root.right = buildTree(inorder, preorder, inIndex + 1, inEnd);
        return root;
}
    public static List<Integer> lo(TreeNode root, int L, int U) 
{
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Map<Integer, List<Integer>> levelMap = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> levels = new LinkedList<>();
        queue.add(root);
        levels.add(1);
        while (!queue.isEmpty()) 
{
            TreeNode node = queue.poll();
            int level = levels.poll();
            levelMap.putIfAbsent(level, new ArrayList<>());
            levelMap.get(level).add(node.val);
            if (node.left != null) 
{
                queue.add(node.left);
                levels.add(level + 1);
            
}
            if (node.right != null) 
{
                queue.add(node.right);
                levels.add(level + 1);
            
}
}
        for (int i = L; i <= U; i++) 
{
            

                List<Integer> nodes = levelMap.get(i);
                if (i % 2 == 0) Collections.reverse(nodes);
                result.addAll(nodes);

        
}
        return result;
}
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inorder = new int[n];
        int[] preorder = new int[n];
        for (int i = 0; i < n; i++) inorder[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) preorder[i] = scanner.nextInt();
        TreeNode root = ct(inorder, preorder, n);
        int L = scanner.nextInt();
        int U = scanner.nextInt();
        List<Integer> result = lo(root, L, U);
        for (int num : result) 
{
            System.out.print(num + " ");
}

}

}