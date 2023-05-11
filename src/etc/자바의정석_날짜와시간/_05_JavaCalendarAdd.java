package etc.자바의정석_날짜와시간;

import java.util.Arrays;
import java.util.Calendar;

public class _05_JavaCalendarAdd {
    public static void main(String[] args) {

        Calendar date = Calendar.getInstance();
        date.clear(); // 이전 시간에 clear의 중요성 얘기했음. 날짜간의 일 차이가 2일인데 클리어 안해서 1.999998 나오면 1일차로 나옴
        date.set(2020,7,31); // 2020년 8월 31일 설정

        // add() 다른 필드 영향 줌
        date.add(Calendar.DATE, 1); // 2020년 9월 1일
        date.add(Calendar.MONTH, -8); // 2020 1월 1일

        // roll() 다른 필드 영향 XXXXXX
        date.roll(Calendar.DATE, 1); //  2020년 8월 1일
        date.roll(Calendar.MONTH, -8); // 2020년 12월 31일
    }
}
