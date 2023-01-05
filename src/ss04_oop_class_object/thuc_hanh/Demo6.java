package ss04_oop_class_object.thuc_hanh;
import java.util.Currency;
import java.util.Date;
import java.time.ZonedDateTime;
import java.util.Calendar;
public class Demo6 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long miliSeconds = System.currentTimeMillis();
        Date date1 = new Date(miliSeconds);
        System.out.println(date1);
        long startime = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(startime);
        long mili = System.currentTimeMillis();
        System.out.println(mili);

    }
}
