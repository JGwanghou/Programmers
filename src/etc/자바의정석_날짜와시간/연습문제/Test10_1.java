package etc.자바의정석_날짜와시간.연습문제;

/*
    Calendar 클래스와 SimpleDateFormat 클래스로 2010년 매월 두번 째 일요일 출력
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test10_1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.set(2010, 0, 1);

        for (int i = Calendar.JANUARY; i < Calendar.DECEMBER; i++) {
            int weekDay = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일구하기 (1:일요일 ~ 7:토요일)
            int secondSunday = (weekDay == 1) ? 8 : 16-weekDay;
            cal.set(Calendar.DAY_OF_MONTH, secondSunday);

            Date d = cal.getTime();
            System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
        }
        // 2010-01-10은 2번째 일요일입니다.
        // 2010-02-14은 2번째 일요일입니다.
    }
}
