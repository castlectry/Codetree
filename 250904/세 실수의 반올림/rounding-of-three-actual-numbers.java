import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());

        System.out.printf("%.3f\n", a);
        System.out.printf("%.3f\n", b);
        System.out.printf("%.3f\n", c);



    }
}