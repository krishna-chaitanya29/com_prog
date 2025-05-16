package Fs_questions;

public class FS-22_Isomorphic_Strings {
    
}
/*
 * You are given two strings. Determine whether the first string can be converted to the second 
by replacing each character with a unique character while preserving the order.

Each character from the first string must map to one and only one character in the second string and vice versa.
Note: Two characters in the first string cannot map to the same character in the second.

Explanation:
------------
Two strings are isomorphic if:
•	Each character in the first-string maps to one unique character in the second string.
•	This mapping must be consistent throughout the string.
•	No two different characters from the first-string map to the same character in the second string.


Input Format:
-------------------
Line-1: two space-separated strings

Output Format:
----------------------
Line-1: Boolean value True/False


Sample Input-1:
---------------
ACAB XCXY

Sample Output:
----------------------
True

Explanation:
------------
A → X, C → C, B → Y — all mappings are unique and consistent.


Sample Input:
---------------------
FOO BAR

Sample Output:
----------------------
False

 */

 import java.util.*;
class IsomorphicStringsCheck{
    public static boolean check(String a ,String b,Map<Character,Character> map1 , Map<Character,Character> map2){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++){
            char ca = a.charAt(i);
            char cb = b.charAt(i);
            if(map1.containsKey(ca)){
                if(map1.get(ca)!=cb) return false;
            }
            else{
            map1.put(ca,cb);
            }
            if(map2.containsKey(cb)){
                if(map2.get(cb)!=ca) return false;
            }
            else{
            map2.put(cb,ca);
            }
            
            
        }
        return true;
    }
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String a = s[0];
        String b = s[1];
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        
            // int i=0;
            // while(i<a.length()){
            //     map1.put(a.charAt(i),b.charAt(i));
            //     map2.put(b.charAt(i),a.charAt(i));
            //     i++;
            // }
            System.out.println(check(a,b,map1,map2));
       
        
    }
}