import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int countValue = 0;

        for(int row=1; row<=N; row++) {
            for(int col=N; col>N-row; col--) {
                System.out.print(++countValue + " ");
            }
            System.out.println();
        }

    }
}