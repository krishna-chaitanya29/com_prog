package A1_grand_test_01_apr_3.programs;

public class GrandTest_Program1 {
    
}
/*
 * import java.util.Scanner;

public class HighwayMaxScore {
    private static final int MOD = 1_000_000_007; //Equivalent to 10^9 + 7

    public static int getMaxScore(int[] A, int[] B) {
        //Write your code and return an integer, the maximum score
        int i=0 ,j=0;
        long sumA = 0,sumB=0,total=0;
        
        while(i<A.length && j<B.length){
            if(A[i]>B[j]){
                sumA+=A[i++];
            }
            else if(B[j]>A[i]){
                sumB+=B[j++];
            }
            else{
                sumA+=A[i++];
                sumB+=B[j++];
                total = Math.max(sumA,sumB);
                total%=MOD;
                sumA=0;
                sumB=0;
                
            }
            while(i<A.length) sumA+=A[i++];
            while(i<B.length) sumB+=B[j++];
            total+=Math.max(sumA,sumB);
            total%=MOD;
        }
        return (int)total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Highway A
        int n = scanner.nextInt();
        int[] highwayA = new int[n];
        for (int i = 0; i < n; i++) {
            highwayA[i] = scanner.nextInt();
        }

        // Read Highway B
        int m = scanner.nextInt();
        int[] highwayB = new int[m];
        for (int i = 0; i < m; i++) {
            highwayB[i] = scanner.nextInt();
        }

        // Calculate and print max score
        System.out.println(getMaxScore(highwayA, highwayB));

        scanner.close();
    }
}

 */