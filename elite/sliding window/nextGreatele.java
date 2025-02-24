import java.util.*;

public class nextGreatele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int left = 0;
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(left<n){
                set.add(arr[i]);
            }
        }
    }
}
