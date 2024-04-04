import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=1; i<=n; i++){ q.add(i); }


        System.out.print("<");
        while(q.size()>1){
            for (int i = 1; i < k; i++) {
                q.add(q.poll());
            }
            System.out.print(q.poll());

            System.out.print(", ");
        }
        System.out.print(q.poll());
        System.out.print(">");
    }
}
