import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] dp = new long[N+1];
        dp[0] = 1; // 길이 0은 "빈 수" 1가지

        for (int len = 1; len <= N; len++) {
            for (int d = 1; d <= 9; d++) {
                if (len - d >= 0) {
                    dp[len] += dp[len - d];
                }
            }
        }

        System.out.println(dp[N]);
    }
}
