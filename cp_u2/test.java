import java.util.PriorityQueue;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read input values into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Add the squares of the array elements to the priority queue
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i] * arr[i]);
        }
        
        // Poll and print elements from the priority queue
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
