package etc.자바의정석_날짜와시간;

import java.util.Calendar;
import java.util.Date;

public class _04_JavaCalendarClear {
    public static void main(String[] args) {
        Calendar dt = Calendar.getInstance();

        System.out.println(new Date(dt.getTimeInMillis())); // 출력 결과 보기좋게 하기위해 new Date() 쓴 것 일뿐
//        dt.clear();

//        System.out.println(new Date(dt.getTimeInMillis())); // 1970년 ... 컴퓨터 나온 시점

        dt.clear(Calendar.SECOND);      // 초를 초기화
        dt.clear(Calendar.MINUTE);      // 분을 초기화
        dt.clear(Calendar.HOUR_OF_DAY); // 시간을 초기화
        dt.clear(Calendar.HOUR);        // 시간을 초기화

        System.out.println(new Date(dt.getTimeInMillis())); // Fri May 12 00:00:00 KST 2023
    }
}
