import java.util.*;
class Node 
{
    int data;
    Node left, right;
    Node(int data) 
{
        this.data = data;
        left = right = null;
}
}
public class Main 
{
    public static Node buildTree(List<Integer> inOrder, List<Integer> levelOrder) 
{
        if (inOrder.isEmpty() || levelOrder.isEmpty())
            return null;
        int rootVal = levelOrder.get(0);
        Node root = new Node(rootVal);
        int index = inOrder.indexOf(rootVal);
        List<Integer> leftInOrder = inOrder.subList(0, index);
        List<Integer> rightInOrder = inOrder.subList(index + 1, inOrder.size());
        List<Integer> leftLevel = new ArrayList<>();
        List<Integer> rightLevel = new ArrayList<>();
        for (int val : levelOrder) 
        {
            if (leftInOrder.contains(val)) 
            {
                leftLevel.add(val);
            } else if (rightInOrder.contains(val)) 
                {
                rightLevel.add(val);
                }
        }
        root.left = buildTree(new ArrayList<>(leftInOrder), leftLevel);
        root.right = buildTree(new ArrayList<>(rightInOrder), rightLevel);
        return root;
    }
    public static int[] deepestLevelSum(Node root) 
    {
        if (root == null)
            return new int[] {0, 0};
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        int deepestSum = 0;
        while (!queue.isEmpty()) 
        {
            depth++;
            int levelSum = 0;
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) 
            {
                Node current = queue.poll();
                levelSum += current.data;
                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
                }
            deepestSum = levelSum;
        }
        return new int[] {depth, deepestSum};
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> levelOrder = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            inOrder.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) 
        {
            levelOrder.add(sc.nextInt());
        }
        Node root = buildTree(inOrder, levelOrder);
        int[] result = deepestLevelSum(root);
        System.out.println(result[0] + " " + result[1]);
    }
}