import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] time = new int[n];

        for(int i=0; i<n; i++){
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);

        int cnt = 0, sum = 0;
        for(int t: time){
            cnt += t;
            sum += cnt;
        }
        System.out.print(sum);
    }
}