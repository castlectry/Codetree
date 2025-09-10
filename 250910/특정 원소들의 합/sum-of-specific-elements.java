import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        for(int row=0; row<4; row++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int col=0; col<=row; col++) {
                result += Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(result);

    }
}