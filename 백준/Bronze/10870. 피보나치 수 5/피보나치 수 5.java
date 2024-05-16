import java.util.Scanner;

public class Main {
    public static long[] fibo = new long[21];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo[0] = 0; fibo[1] = 1; fibo[2] = 1;

        int num = sc.nextInt();
        if(num == 0 || num == 1 || num == 2){
            System.out.print(fibo[num]);
            return;
        }
        System.out.print(Fibo(num));
    }

    private static long Fibo(int n){
        if(n==1){
            return 1;
        } else if(fibo[n] == 0){
            fibo[n] = Fibo(n-1) + Fibo(n-2);
        }

        return fibo[n];
    }

}
