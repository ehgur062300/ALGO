import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        List<Member> list = new ArrayList<>();

        for(int i=0; i<t; i++){
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Member(i,age,name));
        }

        list.sort(new AgeComparator());

        for(Member m : list){
            System.out.println(m.age + " " + m.name);
        }
    }
}

class AgeComparator implements Comparator<Member>{
    @Override
    public int compare(Member m1, Member m2){
        if(m1.age == m2.age){
            return m1.idx - m2.idx;
        }
        return m1.age - m2.age;
    }
}

class Member {
    int idx;
    int age;
    String name;

    public Member(int idx , int age, String name) {
        this.idx = idx;
        this.age = age;
        this.name = name;
    }
}
