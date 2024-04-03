import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR_OF_DAY, 9);

        String formattedDateTime = dateFormat.format(new Date(cal.getTimeInMillis()));
        System.out.print(formattedDateTime);
    }
}
