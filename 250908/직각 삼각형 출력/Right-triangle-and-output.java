import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        for(int row=0; row<N; row++){
            for(int col=2*row + 1; col>0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}