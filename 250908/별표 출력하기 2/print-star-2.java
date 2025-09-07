import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int row=0; row<N; row++) {
            for(int col=N; col>row; col--) {

                System.out.print("* ");

            }
            System.out.println();
        }

    }
}