import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(n >= 3000 ? "book" : 
                                n >= 1000 ? "mask" : "no"
        );

        /* 
        살 수 있는 가장 비싼 물건 출력

        물건   가격

        book  3000
        mask  1000

        */


    }
}