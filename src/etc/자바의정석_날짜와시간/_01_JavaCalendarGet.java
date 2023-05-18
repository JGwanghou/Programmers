package etc.자바의정석_날짜와시간;

import java.util.Calendar;
import java.util.Stack;

public class _01_JavaCalendarGet {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // Calendar 객체 생성

        System.out.println("올해년도 : "         + cal.get(Calendar.YEAR));
        System.out.println("월(0~11), 0:1월 : " + cal.get(Calendar.MONTH));
        System.out.println("올해의 몇째 주 : "   + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇째 주 : "  + cal.get(Calendar.WEEK_OF_MONTH));

        System.out.println("이 달의 몇 일 : "    + cal.get(Calendar.DATE)); // 같다.
        System.out.println("이 달의 몇 일 : "    + cal.get(Calendar.DAY_OF_MONTH)); // 같다.
        System.out.println("올해의 몇 일 : "     + cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1~7, 1:일요일 ... 7:토요일) : " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("이 달의 몇 째 요일 : "+ cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) );
        System.out.println("오전_오후(0:오전, 1:오후)" + cal.get(Calendar.AM_PM));

        System.out.println("시간(0~11) : " + cal.get(Calendar.HOUR));
        System.out.println("시간(0~23) : " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59) : " + cal.get(Calendar.MINUTE));
        System.out.println("초(0~59) : " + cal.get(Calendar.SECOND));
        System.out.println("1000분의 1초(0~999) : " + cal.get(Calendar.MILLISECOND));
        System.out.println("TimeZone(-12 ~ +12) : " + (cal.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        System.out.println("이 달의 마지막 날 : " + cal.getActualMaximum(Calendar.DATE));
    }


}
