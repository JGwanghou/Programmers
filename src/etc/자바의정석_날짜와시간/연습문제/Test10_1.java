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

        for (int i = 0; i < 12; i++) {
            cal.set(Calendar.YEAR, 2021);
            cal.set(Calendar.MONTH, i);
            for (int j = 1; j < cal.getActualMaximum(Calendar.DATE); j++) {
                cal.set(Calendar.DATE, j);

                if(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 2 && cal.get(Calendar.DAY_OF_WEEK) == 1){
                    Date d = cal.getTime();
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
                }
            }
        }
    }
}
