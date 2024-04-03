import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int rope = sc.nextInt();
            list.add(rope);
        }
        list.sort(Comparator.naturalOrder());

        int max = 0;
        for(int r:list){
            if(max < r*n){ max = r*n; }
            n--;
        }

        System.out.print(max);
    }
}
