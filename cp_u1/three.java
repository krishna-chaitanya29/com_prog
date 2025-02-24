import java.util.*;

class three {
    void m(){
        System.out.println("method ");
    }
    public static void main(String[] args) {
        int[] a , b;
        a = new int[3];
        b = new int[2];
        System.out.print(Arrays.toString(a));
        
        three[] obj = new three[5];
        obj[0].m();

        System.out.print(Arrays.toString(a));
    }
}
