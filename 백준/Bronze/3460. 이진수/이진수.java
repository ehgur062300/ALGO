
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();

            StringBuffer sb = new StringBuffer();
            sb.append(Integer.toBinaryString(n));
            sb.reverse();

            for (int c=0; c<sb.length(); c++) {
                if (sb.charAt(c) == '1') {
                    System.out.print(c + " ");
                }
            }
        }
    }
}
