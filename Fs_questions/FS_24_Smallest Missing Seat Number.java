package Fs_questions;

public class FS_24_Smallest Missing Seat Number {
    
}
/*
 * Find the Smallest Missing Seat Number
Imagine you're in a classroom where the seats are numbered from 0 to n-1. Each seat has a unique number assigned to it. The teacher arranged the students by their seat numbers, but some students didn’t show up, and their seats are empty.
Your task is to find the smallest missing seat number from this sorted list of non-negative integers.

Input Format:
-------------
Line-1: A single integer n — the number of seat numbers in the array
Line-2: A sorted list of n space-separated non-negative integers (distinct seat numbers)

Output Format:
-------------
Line-1: A single integer — the smallest missing non-negative seat number

Constraints:
-------------
-> 1 ≤ n ≤ 10^5
-> 0 ≤ seat number ≤ 10^9
-> The array is sorted in strictly increasing order
-> All seat numbers are distinct and non-negative
-> Output must be the smallest non-negative integer not present in the array
If the seats are perfectly filled (like [0, 1, 2, 3, 4]), the smallest missing seat number is the total number of seats (i.e., 5).
-> Expected time complexity: O(log n)

Sample Input-1:
-------------
7
0 1 2 6 9 11 15

Sample Output-1:
-------------
3

Sample Input-2:
-------------
8
1 2 3 4 6 9 11 15

Sample Output-2:
-------------
0

Sample Input-3:
-------------
7
0 1 2 3 4 5 6

Sample Output-3:
-------------
7

 */
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int k=0;k<n;k++){
            if(arr[k]!=k){
                System.out.println(k);
                break;
            }
            // System.out.println(k+" "+n);
            if(k==n-1){
                System.out.print(k+1);
            }
            
        }
    }
}