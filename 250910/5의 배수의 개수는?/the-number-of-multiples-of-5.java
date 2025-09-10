import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        /* 4*4 배열 */
        int result = 0;

        for(int row=0; row<4; row++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int col=0; col<4; col++) {

                if(Integer.parseInt(st.nextToken()) % 5 == 0) {
                    result++;
                }

            }
        }

        System.out.println(result);
    }
}