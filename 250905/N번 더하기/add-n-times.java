import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int nResult = A;

        for(int i=0; i<N; i++) {
            nResult += N;
            System.out.println(nResult);
        }

    }
}