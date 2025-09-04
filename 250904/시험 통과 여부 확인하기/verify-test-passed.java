import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N >= 80) {
            System.out.println("pass");
        } else {

            int neededScore = 80 - N;

            System.out.println(neededScore + " more score");

        }

    }
}