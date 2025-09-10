import java.util.*;
import java.io.*;

public class Main {

    public static int obesityCalc(int height, int weight) {

        return (int) 10000 * weight / (height * height);

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int b = obesityCalc(h, w);

        System.out.println(b);

        if(b >= 25) {
            System.out.println("Obesity");
        }
        

    }
}