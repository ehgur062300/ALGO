import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long[] p = new long[101];
        p[1] = 1; p[2] = 1; p[3] = 1;
        p[4] = 2; p[5] = 2; p[6] = 3;
        p[7] = 4; p[8] = 5; p[9] = 7;
        p[10] = 9;

        for(int i=11; i<101; i++){
            p[i] = p[i-1] + p[i-5];
        }

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.println(p[n]);
        }
    }
}