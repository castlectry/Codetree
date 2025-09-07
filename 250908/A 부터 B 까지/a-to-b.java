import java.util.*;
import java.io.*;

public class Main {
    public static int changeValueMethod(int value) {

        if (value % 2 == 0) {
            value+=3;
        } else {
            value*=2;
        }

        return value;
    }
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.print(A + " ");  // 초기 값 출력 (항상 B보다 작거나 같음)

        while (true) {

            A = changeValueMethod(A);

            if(A > B) {
                break;
            } else {
                System.out.print(A + " ");
            }

        }

    }
}