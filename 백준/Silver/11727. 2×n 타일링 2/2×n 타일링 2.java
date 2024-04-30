import java.util.*;

public class Main {
    static long[] dp = new long[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dp[1] = 1; dp[2] = 3;
        dp[3] = 5; dp[4] = 11;

        for(int i=5; i<1001; i++){
            dp[i] = (dp[i-1] + dp[i-2]*2) % 10007;
        }

        System.out.print(dp[n]);
    }
}