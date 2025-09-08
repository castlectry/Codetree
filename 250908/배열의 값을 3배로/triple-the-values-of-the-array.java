import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        

        /* 3*3 배열 고정 */
        int[][] arr = new int[3][3];

        for (int row=0; row<3; row++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int col=0; col<3; col++) {
                arr[row][col] = Integer.parseInt(st.nextToken()) * 3;

                System.out.print(arr[row][col] + " ");

            }

            System.out.println();

        }

    }
}