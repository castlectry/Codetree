import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c = br.readLine().charAt(0);

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};

        int result = 0;


        for(String keyword : arr) {

            if (keyword.charAt(2) == c || keyword.charAt(3) == c) {
                System.out.println(keyword);
                result++;
            }

        }

        System.out.println(result);
        


    }
}