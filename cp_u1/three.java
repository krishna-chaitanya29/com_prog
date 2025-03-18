import java.util.Scanner;

class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k= sc.nextInt();;

        int minutes = 0,left=0;
        int min =  0;
        for (int i = 0; i < arr.length; i++) {
            minutes+=arr[i];
            while(minutes>k ){
                min = Math.max(min, i-left+1);
                minutes-=arr[left];
                left++;
            }
            min = Math.max(min, i-left+1);
            
            
        }
        System.out.println(min);
    }
    
}
