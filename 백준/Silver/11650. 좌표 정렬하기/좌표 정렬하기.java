import java.util.*;

class Spot {
    int x;
    int y;

    public Spot(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        List<Spot> list = new ArrayList<>();
        for(int i=0; i<t; i++){
            list.add(new Spot(sc.nextInt(), sc.nextInt()));
        }

        list.sort(new Comparator<Spot>() {
            @Override
            public int compare(Spot o1, Spot o2) {
                if(o1.x == o2.x){
                    return o1.y-o2.y;
                }
                return o1.x-o2.x;
            }
        });

        for (Spot s : list) {
            System.out.println(s.x +" "+s.y);
        }
    }
}
