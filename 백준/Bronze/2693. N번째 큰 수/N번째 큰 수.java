import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());

            for(int j=0; j<10; j++){
                set.add(sc.nextInt());
            }

            Iterator<Integer> iter = set.iterator();
            for(int it=1; it<3; it++){
                iter.next();
            }
            System.out.println(iter.next());
        }
    }
}
