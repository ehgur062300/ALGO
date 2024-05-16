import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max_people=0, cur_people=0;
        for(int i=0; i<10; i++){
            int minus = sc.nextInt();
            int plus = sc.nextInt();
            cur_people += (plus - minus);

            max_people = Math.max(max_people, cur_people);
        }
        System.out.print(max_people);
    }
}
