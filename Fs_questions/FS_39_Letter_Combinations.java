package Fs_questions;

public class FS_39_Letter_Combinations {
    
}
/*
 * Imagine you're a top-secret agent receiving an encrypted directive from headquarters. 
The message comes as a string of digits, 
and each digit (from 2 to 9) is a cipher for a set of potential code letters. 

To uncover the true instruction, you must translate the string into 
every possible combination of letters by substituting each digit with 
its corresponding set of letters. The final decoded messages listed in lexicographycal order.

Below is the mapping of digits to letters (as found on a traditional telephone keypad):

| Digit | Letters       |
|-------|---------------|
| 2     | a, b, c       |
| 3     | d, e, f       |
| 4     | g, h, i       |
| 5     | j, k, l       |
| 6     | m, n, o       |
| 7     | p, q, r, s    |
| 8     | t, u, v       |
| 9     | w, x, y, z    |

Note: The digit 1 does not correspond to any letters.

Input Format:
-------------
Line-1: A string, represents the message (2-9 inclusive)

Output Format:
--------------
Line-1: List of valid combination

Sample Input-1:
---------------
23

Sample Output-1:
----------------
[ad, ae, af, bd, be, bf, cd, ce, cf]


Sample Input-2: 
---------------
2

Sample Output-2:
----------------
[a, b, c]


Constraints:
------------
- 0 <= digits.length <= 4  
- Each digit in the input is between '2' and '9'.
 */

import java.util.*;
class sol{
    public static final Map<Character,String>Map=new HashMap<>();
        static{
            Map.put('2', "abc");
            Map.put('3', "def");
            Map.put('4', "ghi");
            Map.put('5', "jkl");
            Map.put('6', "mno");
            Map.put('7', "pqrs");
            Map.put('8', "tuv");
            Map.put('9', "wxyz");
            }
    
    public static List<String> getComb(String s){
        List<String> res = new ArrayList<>();
        if(s==null || s.length() == 0 ){
            return res;
        }
        bT(res,new StringBuilder(),s,0);
        return res;
    }
    public static void bT(List<String> res,StringBuilder comb , String s, int index){
        if(s.length() == index){
            res.add(comb.toString());
            return;
        }
        String letters = Map.get(s.charAt(index));
        for(char l:letters.toCharArray()){
            comb.append(l);
            bT(res,comb,s,index+1);
            comb.deleteCharAt(comb.length()-1);
        }
        
    }
    
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getComb(s));
    }
}