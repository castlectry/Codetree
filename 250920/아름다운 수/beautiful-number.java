import java.io.*;

public class Main {

    static int N;       // 자리 수
    static int result;  // 아름다운 수 개수

    // depth: 현재까지 채운 자리 수
    public static void beautyNumber(int depth) {
        if (depth == N) {
            result++;
            return;
        }
        if (depth > N) return;

        // 1부터 9까지 가능한 숫자
        for (int d = 1; d <= 9; d++) {
            // d를 d번 연속으로 채운다고 가정
            beautyNumber(depth + d);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        result = 0;

        beautyNumber(0);

        System.out.println(result);
    }
}
