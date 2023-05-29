package etc.자바의정석_제네릭;

import java.util.ArrayList;

public class _01_GenericTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30); // 타입체크 강화 지네릭스 덕분


//      ArrayList list = new ArrayList();
//      list.add(10); // list.add(new Intger(10));
//      list.add(20);
//      list.add("30"); 일단 아무 문제 없다,
//      Integer i = (Integer)list.get(2); 컴파일 OK, 실행 시 예외발생함.. 컴파일 한계

        System.out.println(list);
    }

}
