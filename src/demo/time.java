package demo;

import java.util.Calendar;

public class time {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        System.out.println("Ngay gio hien tai: " + calendar.getTime());
//        calendar.add(Calendar.DATE, -100);
//        System.out.println("15 ngay sau: " + calendar.getTime());
//        calendar.add(Calendar.MONTH, 4);
//        System.out.println("4 thang sau: " + calendar.getTime());
//        calendar.add(Calendar.YEAR, 2);
//        System.out.println("2 nam sau: " + calendar.getTime());
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
