import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());

            if(a%2 != 0)
                a++;

            int b = Integer.parseInt(st.nextToken());

            int result = 0;

            for(int j=a; j<=b; j+=2) {
                result += j;
            }

            System.out.println(result);

        }

    }
}