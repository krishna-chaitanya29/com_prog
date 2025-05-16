package Fs_questions;

public class FS-27_Minimum Number After Atmost K Swaps {
    
}
/*
 * You are given a string S representing a positive integer and an integer k. Your task is to find the smallest possible number that can be formed by performing at most k swaps between any two digits of the string.
If k == 0, return the original number.
If the number is already the smallest possible permutation, return it as-is.
If the input is null or empty, return it unchanged.

A swap operation means exchanging the positions of any two digits (not necessarily adjacent). Each swap counts as one operation. The goal is to minimize the number.

Input Format:
-----------
A string S of digits (1 ≤ S.length ≤ 10)
An integer k (0 ≤ k ≤ 10) representing the number of allowed swaps.

Output Format:
------------
A string representing the smallest number possible after performing at most k swaps.

Constraints:
--------------
1 ≤ length(S) ≤ 10
0 ≤ k ≤ 10
Digits are in the range '0' to '9'
No leading zeros in input unless the number is exactly "0"
Each swap counts as 1 operation, regardless of position

Sample Input-1:
------------
934651
2

Sample Output-1:
----------------
134569

Sample Input-2:
-------------
11111
3
Sample Output-2:
--------------
11111


 */


 import java.util.*;

class sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(String.valueOf(chalo(s, k)));
    }

    public static char[] chalo(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return s.toCharArray();
        }
        char[] num = s.toCharArray();
        suruKaro(num, k);
        return num;
    }

    public static void suruKaro(char[] num, int k) {
        int pointer = 0;
        while (pointer < num.length && k > 0) {
            int minIndex = pointer;
            for (int i = pointer + 1; i < num.length; i++) {
                if (num[i] < num[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != pointer) {
                swap(num, pointer, minIndex);
                k--;
            }
            pointer++;
        }
    }

    public static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}