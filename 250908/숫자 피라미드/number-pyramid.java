import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int row=1; row<=N; row++) {
            for(int col=0; col<row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}