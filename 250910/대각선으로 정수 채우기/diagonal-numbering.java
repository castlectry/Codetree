import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        int nowValue = 1;   // 시작 카운팅 값
        arr[0][0] = 1;

        // 첫 열 기준 카운팅
        for(int col=0; col<M; col++) {
            
            int row = 0;

            if(col > 0) {   // 첫 열이라면

                arr[row][col] = ++nowValue; // 세로 첫 열 먼저 채우고

                int nowColPosition = col;
                int nowRowPosition = 0;

                while(true) {   // 좌측 하단 대각선으로 이동 시작

                    if(nowColPosition == 0 || nowRowPosition == N-1) { break; } // 범위 밖을 벗어나려 한다면 break

                    arr[++nowRowPosition][--nowColPosition] = ++nowValue;

                }

            }

        }

        
        for(int row=1; row<N; row++) {  // 마지막 열 기준 아래로 대각선 채우기

                arr[row][M-1] = ++nowValue;

                int nowColPosition = M-1;
                int nowRowPosition = row;

                while(true) {   // 좌측 하단 대각선으로 이동 시작

                    if(nowColPosition == 0 || nowRowPosition == N-1) { break; } // 범위 밖을 벗어나려 한다면 break

                    arr[++nowRowPosition][--nowColPosition] = ++nowValue;

                }

            }

        /*
        00 (반드시 여기서 시작)
        01 10
        02 11 20
        03 12 21 30 ... 인덱스 순으로 값 증가

        15 24 33
        25 34
        35
        */ 

        // 입력 결과 출력
        for(int row=0; row<N; row++) {
            for(int col=0; col<M; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        
    }
}