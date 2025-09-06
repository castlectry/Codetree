import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String word1 = st.nextToken();
        String word2 = st.nextToken();

        if(word1.length() == word2.length()) {
            System.out.println("same");
        } else {

            int maxLength = Math.max(word1.length(), word2.length());



            System.out.println((word1.length() == maxLength ? word1 : word2) + " " + maxLength);
        }

    }
}