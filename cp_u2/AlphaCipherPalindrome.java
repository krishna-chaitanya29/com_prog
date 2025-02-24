/*
 * AlphaCipher is a string formed from another string by rearranging its letters

You are given a string S.
Your task is to check, can any one of the AlphaCipher is a palindrome or not.

Input Format:
-------------
A string S

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
carrace

Sample Output-1:
----------------
true


Sample Input-2:
---------------
code

Sample Output-2:
----------------
false
 */
package cp_u2;

public class CP_U2_SP2_Palindrome_Permutation {
    
}
import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class AlphaCipherPalindrome {
    public static boolean canFormPalindrome(String s) {
        int mask = 0;

        // Toggle the bit for each character
        for (char ch : s.toCharArray()) {
            int bit = 1 << (ch - 'a'); // Get bit position for character
            mask ^= bit; // Toggle bit using XOR
        }

        // A palindrome can have at most one odd-frequency character
        return (mask & (mask - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        System.out.println(canFormPalindrome(s));
    }
}
