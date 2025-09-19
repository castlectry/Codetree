import java.io.*;
import java.util.*;

public class Main {

    // 상, 하, 좌, 우
    static int[] dRow = {-1, 1, 0, 0};
    static int[] dCol = {0, 0, -1, 1};

    static boolean[][] isVisited;
    static int[][] arr;

    public static void printResult(int startRow, int startCol, int N) {
        int nowValue = arr[startRow][startCol];
        isVisited[startRow][startCol] = true;

        System.out.print(nowValue + " ");

        while (true) {
            boolean moved = false;

            for (int i = 0; i < 4; i++) {
                int nextRow = startRow + dRow[i];
                int nextCol = startCol + dCol[i];

                if (nextRow < 0 || nextCol < 0 || nextRow >= N || nextCol >= N) continue;
                if (isVisited[nextRow][nextCol]) continue;

                if (arr[nextRow][nextCol] > nowValue) {
                    startRow = nextRow;
                    startCol = nextCol;
                    nowValue = arr[nextRow][nextCol];
                    isVisited[startRow][startCol] = true;
                    System.out.print(nowValue + " "); // 이동할 때마다 출력
                    moved = true;
                    break;
                }
            }

            if (!moved) break;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        arr = new int[N][N];
        isVisited = new boolean[N][N];

        int r = Integer.parseInt(st.nextToken()) - 1;
        int c = Integer.parseInt(st.nextToken()) - 1;

        for (int row = 0; row < N; row++) {
            st = new StringTokenizer(br.readLine());
            for (int col = 0; col < N; col++) {
                arr[row][col] = Integer.parseInt(st.nextToken());
            }
        }

        printResult(r, c, N);
    }
}
