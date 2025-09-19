import java.util.Scanner;
public class Main {

    public static int movementRange(int arriveIdx, int startIdx, int peopleCount) {

        int range = arriveIdx - startIdx;
        if(range < 0) {
            range *= -1;
        }

        return range * peopleCount;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int minResult = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++) {
            
            int tmpValue = 0;

            for(int j=0; j<n; j++) {

                tmpValue += movementRange(i, j, a[j]);

            }

            if(minResult > tmpValue) {
                minResult = tmpValue;
            }

        }

        System.out.println(minResult);

    }
}