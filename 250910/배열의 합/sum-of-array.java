import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int N = 4;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int lineValue = 0;

            for(int j=0; j<4; j++) {

                int value = Integer.parseInt(st.nextToken());

                lineValue += value;

            }

            System.out.println(lineValue);

        }

    }
}