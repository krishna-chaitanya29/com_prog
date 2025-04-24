public class U5_SP1_Smallest_Equivalent_String {
    
}
/*
 * Vihaar is working with strings. 
He is given two strings A and B, and another string T,
where the length of A and B is same.

You can find the relative groups of letters from A and B,
using the following rule set:
- Equality rule: 'p' == 'p'
- Symmetric rule: 'p' == 'q' is same as 'q' == 'p'
- Transitive rule: 'p' == 'q' and 'q' == 'r' indicates 'p' == 'r'.

Vihaar has to form the relatively smallest string of T,
using the relative groups of letters.

For example, if A ="pqr" and B = "rst" , 
then we have 'p' == 'r', 'q' == 's', 'r' == 't' .

The relatives groups formed using above rule set are as follows: 
[p, r, t] and [q,s] and  String T ="tts", then relatively smallest string is "ppq".

You will be given the strings A , B and T.
Your task is to help Vihaar to find the relatively smallest string of T.


Input Format:
-------------
Three space separated strings, A , B and T

Output Format:
--------------
Print a string, relatively smallest string of T.


Sample Input-1:
---------------
kmit ngit mgit

Sample Output-1:
----------------
ggit

Explanation: 
------------
The relative groups using A nd B are [k, n], [m, g], [i], [t] and
the relatively smallest string of T is "ggit"


Sample Input-2:
---------------
attitude progress apriori

Sample Output-2:
----------------
aaogoog

Explanation: 
------------
The relative groups using A nd B are [a, p], [t, r, o], [i, g] and [u, e, d, s]
the relatively smallest string of T is "aaogoog"
 */
public class InnerU5_SP1_Smallest_Equivalent_String {

    
}


import java.util.*;
class SmallestString{
    public static char getParent(char x,char[] parent){
        if(x!=parent[x-'a']) return parent[x-'a']=getParent(parent[x-'a'],parent);
        return x;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char[] parent=new char[26];
        String s1=sc.next();
        String t1=sc.next();
        for(char i='a';i<='z';i++){
            parent[i-'a']=i;
        }
        char[] s=s1.toCharArray();
        char[] t=t1.toCharArray();
        for(int i=0;i<s.length;i++){
            char p1=getParent(s[i],parent);
            char p2=getParent(t[i],parent);
            if(p1<p2) parent[p2-'a']=p1;
            else parent[p1-'a']=p2;
        }
        String k=sc.next();
        char[] k1=k.toCharArray();
        for(int i=0;i<k1.length;i++){
            k1[i]=getParent(k1[i],parent);
        }
        System.out.println(new String(k1));
    }
}

 