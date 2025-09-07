import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int row=1; row<=N; row++) {
            for(int col=1; col<=N; col++) {
                System.out.print(row + " * " + col + " = " + row*col);

                if(col != N) {
                    System.out.print(", ");
                }

            }

            System.out.println();

        }

    }
}