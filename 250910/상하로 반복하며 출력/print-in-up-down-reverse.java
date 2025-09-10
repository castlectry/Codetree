import java.util.*;
import java.io.*;

public class Main {
    public static int[][] settingArray(int N) {

        int[][] arr = new int[N][N];

        for(int col=0; col<N; col++) {

            for(int row=0; row<N; row++) {

                if(col % 2 == 0) {
                    arr[row][col] = row+1;
                } else {
                    arr[row][col] = N-row;
                }

            }

        }

        return arr;

    }

    public static void printResult(int[][] arr, int N) {

        for(int row=0; row<N; row++) {

            for(int col=0; col<N; col++) {
                System.out.print(arr[row][col]);
            }

            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = settingArray(N);

        printResult(arr, N);

        

    }
}