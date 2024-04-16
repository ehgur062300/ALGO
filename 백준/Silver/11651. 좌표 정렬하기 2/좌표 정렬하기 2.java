
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Spot2 {
    int x;
    int y;

    public Spot2(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        List<Spot2> list = new ArrayList<>();
        for(int i=0; i<t; i++){
            list.add(new Spot2(sc.nextInt(), sc.nextInt()));
        }

        list.sort(new Comparator<Spot2>() {
            @Override
            public int compare(Spot2 o1, Spot2 o2) {
                if(o1.y == o2.y){
                    return o1.x-o2.x;
                }
                return o1.y-o2.y;
            }
        });

        for (Spot2 s : list) {
            System.out.println(s.x +" "+s.y);
        }
    }
}
