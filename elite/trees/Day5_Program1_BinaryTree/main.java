import java.util.*;
class node 
{
    int val;
    node left, right;
    node(int val) 
    {
        this.val = val;
        this.left = this.right = null;
    }
}
public class main 
{
    private static Map<Integer, Integer> inOrderIndexMap;
    private static int postIndex;
    public static node buildTree(int[] inorder, int[] postorder, int n) 
   {
        inOrderIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) 
        {
            inOrderIndexMap.put(inorder[i], i);
        }
        postIndex = n - 1;
        return constructTree(inorder, postorder, 0, n - 1);
        


    }
    private static node constructTree(int[] inorder, int[] postorder, int inStart, int inEnd) 
    {
        if (inStart > inEnd) return null;
        int rootVal = postorder[postIndex--];
        node root = new node(rootVal);
        int inIndex = inOrderIndexMap.get(rootVal);
        root.right = constructTree(inorder, postorder, inIndex + 1, inEnd);
        root.left = constructTree(inorder, postorder, inStart, inIndex - 1);
        return root;
    }
    public static Map<Integer, List<Integer>> levelOrder(node root) 
    {
        Map<Integer, List<Integer>> levelMap = new TreeMap<>();
        if (root == null) return levelMap;
        Queue<node> queue = new LinkedList<>();
        Queue<Integer> levels = new LinkedList<>();
        queue.add(root);
        levels.add(1);
        while (!queue.isEmpty()) 
        {
            node node = queue.poll();
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
        return levelMap;
    }

    public static void processQueries(Map<Integer, List<Integer>> levelMap, int[][] queries) 
   {
        for (int[] query : queries) 
        {
            int L = query[0], U = query[1];
            List<Integer> result = new ArrayList<>();
            for (int level = L; level <= U; level++) 
            {
                if (levelMap.containsKey(level)) 
                {
                    result.addAll(levelMap.get(level));
                }
            }
            System.out.println(result);
        }
   }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inorder = new int[n];
        int[] postorder = new int[n];
        for (int i = 0; i < n; i++) inorder[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) postorder[i] = scanner.nextInt();
        node root = buildTree(inorder, postorder, n);
        Map<Integer, List<Integer>> levelMap = levelOrder(root);
        int q = scanner.nextInt();
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) 
        {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }
        processQueries(levelMap, queries);
    }
}