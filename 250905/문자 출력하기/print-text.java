import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 8회 반복 출력

        char c = br.readLine().charAt(0);

        for(int i=0; i < 8; i++) {
            System.out.print(c);
        }

    }
}