import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ropes = new int[n];
        for(int i=0; i<n; i++){
            ropes[i] = sc.nextInt();
        }
        Arrays.sort(ropes);

        int answer = 0;
        for(int r:ropes){
            answer = Math.max(answer,r*n);
            n--;
        }

        System.out.print(answer);
    }
}
