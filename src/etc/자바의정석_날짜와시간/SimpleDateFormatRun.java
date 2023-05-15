package etc.자바의정석_날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    .format() 사용
    날짜와 시간 -> 문자열로
 */

public class SimpleDateFormatRun {
    public static void main(String[] args) {
        Date today = new Date(); // 현재의 날짜와 시간
        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf1.format(today));

        sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
        System.out.println(sdf2.format(today));

        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(sdf3.format(today));

        sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        System.out.println(sdf4.format(today));
        System.out.println();

        sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날이다.");
        System.out.println(sdf5.format(today));

        sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날이다.");
        System.out.println(sdf6.format(today));

        sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주이다.");
        System.out.println(sdf7.format(today));

        sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주이다.");
        System.out.println(sdf8.format(today));

        sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일이다.");
        System.out.println(sdf9.format(today));
    }
}
