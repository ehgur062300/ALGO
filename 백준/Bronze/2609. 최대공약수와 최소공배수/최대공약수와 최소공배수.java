import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(a,b);
        System.out.println(gcd);
        System.out.println(lcm(a,b,gcd));

    }
    private static int gcd(int a, int b){
        int temp;
        while(b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    private static int lcm(int a, int b, int gcd){
        return (a * b)/gcd;
    }
}
