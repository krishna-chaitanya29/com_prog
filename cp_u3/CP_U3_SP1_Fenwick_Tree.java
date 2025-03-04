/*
 * Malika taught a new fun time program practice for Engineering Students.
As a part of this she has given set of N numbers, and asked the students 
to perform the operations listed below:
1. sumRange(start, end) - return the sum of numbers between the indices start and end, both are inclusive.
2. update(ind, val) - update the value at the index 'ind' to 'val'.

Your task is to solve this problem using Fenwick Tree concept.

Input Format:
-------------
Line-1: Two integers N and Q, size of the array(set of numbers) and query count.
Line-2: N space separated integers.
next Q lines: Three integers option, start/ind and end/val.

Output Format:
--------------
An integer result, for every sumRange query.


Sample Input-1:
---------------
8 5
1 2 13 4 25 16 17 8
1 2 6		//sumRange
1 0 7		//sumRange
2 2 18	//update
2 4 17	//update
1 2 7		//sumRange

Sample Output-1:
----------------
75
86
80



Sample Input-2:
---------------
8 5
1 2 13 4 25 16 17 8
1 2 6		
1 0 7		
2 2 18	
2 4 17	
1 0 7

Sample Output-2:
----------------
75
86
83

 */


package cp_u3;

public class CP_U3_SP1_Fenwick_Tree {
    
}
import java.util.*;
class FenWickTree{
    int[] BIT;
    int[] nums;
    int n ;
    public FenWickTree(int[] nums){
        this.n = nums.length;
        this.nums = nums;
        BIT = new int[n+1];
        for(int i=0;i<n;i++){
            add(i+1 , nums[i]);
        }
    }
    public void add(int index , int val){
        while(index <= n){
            BIT[index] += val;
            index += (index & -index);
        }
    }
    public void upDate(int index , int val){
        int diff = val - nums[index-1];
        nums[index-1] = val;
        add(index , diff);
    }
    public int sum(int i){
        int sum = 0;
        while(i > 0){
            sum += BIT[i];
            i-= (i & -i);
        }
        return sum;
    }
    public int sumRange(int l , int r){
        return sum(r) - sum(l-1);
    }
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int q = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        FenWickTree ft = new FenWickTree(arr);
        List<Integer> output = new ArrayList<>();
        
        while(q-- > 0){
            int type = sc.nextInt();
            if(type==1){
                int l = sc.nextInt();
                int r = sc.nextInt();
                output.add(ft.sumRange(l+1,r+1));
            }
            else{
                int index = sc.nextInt();
                int val = sc.nextInt();
                ft.upDate(index+1,val);
            }
        }
        
        for (int res : output){
            System.out.println(res);
            }
    }
}