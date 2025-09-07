import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int inputNumber = Integer.parseInt(br.readLine());

            if(inputNumber == 25) {
                System.out.println("Good");

                break;
            } else if (inputNumber < 25) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }

        }

    }
}