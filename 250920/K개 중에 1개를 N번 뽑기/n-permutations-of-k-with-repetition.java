import java.util.*;
import java.io.*;

public class Main {

    static int N = 0, K = 0;

    public static void pickCard(int depth, int[] cardList) {

        if (depth == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(cardList[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= K; i++) {
            cardList[depth] = i;           // 현재 depth에 i 저장
            pickCard(depth + 1, cardList); // 다음 depth로
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken()); // 1 ~ K
        N = Integer.parseInt(st.nextToken()); // N개 뽑기 (중복 가능)

        int[] pickCardList = new int[N];

        pickCard(0, pickCardList);
    }
}
