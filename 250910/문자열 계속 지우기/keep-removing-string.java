import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();

        while(true) {

            int idx = A.indexOf(B);
            if (idx == -1) break; // 더 이상 B가 없으면 종료
            A = A.substring(0, idx) + A.substring(idx + B.length()); // 해당 부분만 제거

        }

        System.out.println(A);
    }
}