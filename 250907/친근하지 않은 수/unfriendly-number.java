import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int divide2 = N/2;
        int divide3 = N/3;
        int divide5 = N/5;

        int duplicationNumber = (N/6 + N/10 + N/15);

        int allDuplicationNumber = N/30;

        // System.out.println(divide2);
        // System.out.println(divide3);
        // System.out.println(divide5);
        // System.out.println(duplicationNumber);

        System.out.println(N - (divide2 + divide3 + divide5) + duplicationNumber - allDuplicationNumber);

    }
}