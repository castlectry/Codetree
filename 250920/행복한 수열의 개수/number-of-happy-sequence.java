import java.util.*;
import java.io.*;
  
public class Main {

    static int[][] arr; // N * N
    static int result = 0;

    public static void resultCount(int N, int M) {

        // i 번째에 대한 행과 열 카운트
        for(int i=0; i<N; i++) {

            int rowValue = arr[i][0];
            int rowCount = 0;

            int colValue = arr[0][i];
            int colCount = 0;

            // 행에 대하여 체크
            for(int col=0; col<N; col++) {

                if(arr[i][col] == rowValue) {
                    rowCount++;
                } else {
                    rowValue = arr[i][col];
                    rowCount = 1;
                }

                if(rowCount == M) {

                    result++;

                    break;
                }

            }

            // 열에 대하여 체크
            for(int row=0; row<N; row++) {
                
                if(arr[row][i] == colValue) {
                    colCount++;
                } else {
                    colValue = arr[row][i];
                    colCount = 1;
                }

                if(colCount == M) {

                    result++;

                    break;
                }

            }

        }

        System.out.println(result);

    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        arr = new int[N][N];

        int M = Integer.parseInt(st.nextToken());   // 연속으로 같아야 하는 숫자의 개수

        for(int row=0; row<N; row++) {

            st = new StringTokenizer(br.readLine());

            for(int col=0; col<N; col++) {
                arr[row][col] = Integer.parseInt(st.nextToken());
            }

        }

        resultCount(N, M);

    }
}