import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 체크 수 작아서 이진트리 X

        int checkValue = 0;

        for (int i=1; i<=100; i++) {

            checkValue += i;

            if(checkValue >= N) {
                System.out.println(i);

                break;
            }

        }

    }
}