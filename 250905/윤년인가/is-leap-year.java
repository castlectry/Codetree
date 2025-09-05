import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Y = Integer.parseInt(br.readLine());

        // 윤년 판단
        boolean isYoon = (Y % 4 == 0 && !(Y%100 == 0 && Y%400 != 0));

        System.out.println(isYoon);

    }
}