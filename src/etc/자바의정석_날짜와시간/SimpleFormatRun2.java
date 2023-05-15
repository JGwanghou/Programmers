package etc.자바의정석_날짜와시간;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    parse() 사용
    문자열 -> 날짜와 시간
 */
public class SimpleFormatRun2 {
    public static void main(String[] args) {
        DateFormat df  = new SimpleDateFormat("yyyy년 MM월 dd일"); // 여기서 Date()로 먼저 바꿔야한다.
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try{
            Date d = df.parse("2023년 05월 15일"); // 문자열 -> 날짜로
            System.out.println(df2.format(d)); // 날짜 -> 문자열
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
