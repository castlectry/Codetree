import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            
            int inputNumber = Integer.parseInt(br.readLine());

            if (inputNumber == 0) {
                break;
            } else {
                System.out.println(inputNumber);
            }

        }

    }
}