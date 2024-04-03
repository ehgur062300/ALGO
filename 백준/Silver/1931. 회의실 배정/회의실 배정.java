import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pair> schedule = new ArrayList<>();

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int k = sc.nextInt();
            int v = sc.nextInt();
            schedule.add(new Pair(k,v));
        }
        schedule.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.getEnd() == o2.getEnd()){
                    return o1.getStart()-o2.getStart();
                }
                return o1.getEnd()-o2.getEnd();
            }
        });
        int cnt = 1;
        int chk = schedule.get(0).getEnd();
        for(int i=1; i<N; i++){
            if(schedule.get(i).getStart() >= chk){
                chk = schedule.get(i).getEnd();
                cnt++;
            }
        }

        System.out.println(cnt);
    }
    private static class Pair{
        int start;
        int end;

        public Pair(int start, int end){
            this.start = start;
            this.end = end;
        }

        int getStart(){
            return start;
        }

        int getEnd(){
            return end;
        }
    }
}
