import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void printResult(int[][] arr, int[][] arr2, int N, int M) {

        for(int row=0; row<N; row++) {
            for(int col=0; col<M; col++) {
                System.out.print(arr[row][col] == arr2[row][col] ? "0" : "1");
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static int[][] setArray(int N, int M) throws Exception {

        int[][] arr = new int[N][M];

        for(int row=0; row<N; row++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int col=0; col<M; col++) {

                arr[row][col] = Integer.parseInt(st.nextToken());

            }
        }

        return arr;

    }

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // row
        int M = Integer.parseInt(st.nextToken());   // column

        int[][] arr1 = setArray(N, M);
        int[][] arr2 = setArray(N, M);

        printResult(arr1, arr2, N, M);

        


    }
}