package etc.자바의정석_날짜와시간;

import java.util.*;

class _02_JavaCalendarSet_날짜계산 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2020, 5, 11);

        System.out.println("date1은 " + toString(date1)
                + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고"); // date1은 2020년 6월 11일 목요일이고

        System.out.println("오늘(date2)는 " + toString(date2)
                + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다."); // 오늘(date2)는 2023년 5월 12일 금요일입니다.

        // 두 날짜의 시간 차이 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;

        System.out.println("그 날부터(date1) 지금(date2)까지 " + difference + " 초가 지났습니다."); // 92016000
        System.out.println("일(day)로 계산하면 " + difference/(24 * 60 * 60) + " 일입니다."); // 1065
    }



    public static String toString(Calendar date){
        return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH)+1) + "월" + date.get(Calendar.DATE) + "일";
    }
}
