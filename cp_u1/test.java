import java.util.*;

public class test {
    public static List<Integer> getlen(String s,String pat){
        int left =0;
        Set<Character> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < pat.length(); i++) {
            set.add(pat.charAt(i));
        }
        int count =0;
        for (int right = 0; right < s.length(); right++) {
            if(set.contains(s.charAt(right))){
                count++;
                if(count==1) list.add(right);
                if(count==pat.length()){
                    count = 0;
                    right = right - pat.length()+1;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String pat = sc.nextLine();
        System.out.println(getlen(s,pat));
    }
}

