import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int result = 0;

        int N = sc.nextInt();
        int K = sc.nextInt();

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(count(arr,N,K));
    }
    private static int count(int[] arr,int n, int k){
        int cnt = 0;
        while(k!=0){
           n--;
           if(arr[n] <= k){
               cnt += k/arr[n];
               k %= arr[n];
           }
        }
        return cnt;
    }
}
