package Fs_questions;

public class FS_42_Shard_Combinations {
    
}
/*
 * You are given a crystal with an energy level n. Your goal is to discover all the different ways this crystal could have been created by combining smaller shards.

Each combination must:
- Use only shards with energy values between 2 and n - 1.
- Be represented as a list of shard values whose product equals n.
- Use any number of shards (minimum 2), and the order is ascending order.

Your task is to return all unique shard combinations that can multiply together to recreate the original crystal.

Input Format:
-------------
Line-1: An integer

Output Format:
--------------
Line-1: List of all unique shard combinations

Sample Input-1:
---------------
28

Sample Output-1:
----------------
[[2, 14], [2, 2, 7], [4, 7]]

Sample Input-2:
---------------
23

Sample Output-2:
----------------
[]


Constraints:
- 1 <= n <= 10^4
- Only shards with energy between 2 and n - 1 can be used.

 */

 import java.util.*;

class sol {
    public static void bT(List<Integer> multiples, List<List<Integer>> res, List<Integer> comb, int tar, int index) {
        int prod = 1;
        for (int ele : comb) {
            prod *= ele;}

        if (prod == tar && comb.size() >= 2) {
            res.add(new ArrayList<>(comb));
            return;
            }

        if (prod > tar || index >= multiples.size()) return;

        
        comb.add(multiples.get(index));
        bT(multiples, res, comb, tar, index); 
        comb.remove(comb.size() - 1);


        bT(multiples, res, comb, tar, index + 1);
}

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<Integer> mul = new ArrayList<>();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) mul.add(i);
        
        }

        List<List<Integer>> res = new ArrayList<>();
        bT(mul, res, new ArrayList<>(), num, 0);
        System.out.println(res);
        }

}