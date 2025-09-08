import java.util.*;
import java.io.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] setArray() throws IOException {

        int[][] arr = new int[3][3];

        for(int row=0; row<3; row++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int col=0; col<3; col++) {

                arr[row][col] = Integer.parseInt(st.nextToken());

            }
        }

        return arr;

    }

    public static void printResult(int[][] arr, int[][] arr2) {

        for(int row=0; row<3; row++) {
            for(int col=0; col<3; col++) {
                System.out.print(arr[row][col] * arr2[row][col] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        
               
        int[][] arr = new int[3][3];
        int[][] arr2 = new int[3][3];

        /* 3*3 2개 고정 */
        arr = setArray();
        br.readLine();  // 공백열 입력
        arr2 = setArray();

        printResult(arr, arr2); // 결과 호출

    }
}