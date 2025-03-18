import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void perrev(int[] arr,int k) {
        reverse(arr);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        int l = 0,r = arr.length-1;
        while(l<r){
            swap(arr,l,r);
            r--;l++;
        }
    }
    public static void swap(int[] arr , int l , int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void reverse(int[] arr,int left , int right){
        int l = left,r = right;
        while(l<r){
            swap(arr,l,r);
            r--;l++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        perrev(arr,k);
    }
    
}
