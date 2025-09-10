import java.util.*;
import java.io.*;

public class Main {
    public static void printEven(int N) {

        for(int col=1; col<=N; col++) {

            System.out.print(col);

        }

        System.out.println();

    }

    public static void printOdd(int N) {

        for(int col=N; col>=1; col--) {

            System.out.print(col);

        }

        System.out.println();

    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int row=0; row<N; row++) {

            if(row % 2 == 0) {  // 정방향 출력
                printEven(N);
            } else {            // 역방향 출력
                printOdd(N);
            }

            

        }

    }
}