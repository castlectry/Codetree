import java.util.*;
import java.io.*;

public class Main {

    static int[][] arr;

    static int result = 0;

    // 해당 좌표에서의 3 * 3 코인 개수
    public static void countCoinResult(int x, int y) {

        int tmpCountValue = 0;

        for(int row=x; row<x+3; row++) {
            for(int col=y; col<y+3; col++) {
                
                if(arr[row][col] == 1) {
                    tmpCountValue++;
                }

            }
        }

        if(tmpCountValue > result) {
            result = tmpCountValue;
        }

    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 격자의 크기

        arr = new int[N][N];    // 배열 초기화

        // 동전이 있는 경우 1

        // 배열 값 입력
        for(int row=0; row<N; row++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int col=0; col<N; col++){
                arr[row][col] = Integer.parseInt(st.nextToken());
            }
        }

        // 가능한 범위 순회 시작
        for(int row=0; row<N-2; row++){
            for(int col=0; col<N-2; col++){
                countCoinResult(row, col);
            }
        }

        System.out.println(result);

    }
}