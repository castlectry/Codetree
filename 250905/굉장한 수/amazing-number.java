import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean condition1 = (N%2 == 1) && (N%3 == 0);
        boolean condition2 = (N%2 == 0) && (N%5 == 0);

        System.out.println(condition1 || condition2);

    }
}