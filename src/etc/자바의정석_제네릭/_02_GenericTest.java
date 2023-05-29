package etc.자바의정석_제네릭;

import java.util.ArrayList;

class Tv {}
class Audio {}
class Product {}

public class _02_GenericTest {
    public static void main(String[] args) {
        ArrayList<Tv> list1 = new ArrayList<Tv>(); // Tv 타입의 객체만 저장가능
        ArrayList list2 = new ArrayList();

        list1.add(new Tv());
//        list.add(new Audio()); error

//        Tv t = (Tv)list2.get(0);
        Tv t = list1.get(0);
    }

    public static <T extends Product> ArrayList<T> merge(
            ArrayList<T> list,
            ArrayList<T> list2) {

        ArrayList<T> newList = new ArrayList<>(list);
        newList.addAll(list2);
        return newList;
    }
}
