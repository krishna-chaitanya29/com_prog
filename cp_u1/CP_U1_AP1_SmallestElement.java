/*
 * You are given an array consisting of N integers, and an integer, K. 
Your task is to determine the minimum element in subarrays of size K.

Sample Input1:
--------------
5
10 12 14 11 15
3

Sample Output1:
---------------
10 11 11

Sample Input2:
--------------
5
5 2 1 1 1
4

Sample Output2:
---------------
1 1


 */

import java.util.*;
class CP_U1_AP1_SmallestElement {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }
    //     int k = sc.nextInt();
    //     List<Integer> list = new ArrayList<>();
    //     for (int i = 0; i < k; i++) {
    //         list.add(arr[i]);
    //     }
    //     System.out.println(Collections.min(list)+" ");
    //     for (int i = k; i < n; i++) {
    //         list.remove(0);
    //         list.add(arr[i]);
    //         System.out.println(Collections.min(list)+" ");
    //     }
    // }



    public static void getSmall(int[] arr,int n,int k){
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.print(map.firstKey()+" ");
        for (int i = k; i < n; i++) {
            int out_ele = arr[i-k];
            if(map.get(out_ele)==1) map.remove(out_ele);
            else map.put(out_ele,map.getOrDefault(out_ele,0)-1);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            System.out.print(map.firstKey()+" ");
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
        getSmall(arr,n,k);
    }
}