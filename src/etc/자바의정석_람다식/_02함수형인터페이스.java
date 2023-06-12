package etc.자바의정석_람다식;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
/*
    나의 생각
    각 함수의 특징들은 이해했다.

    아직 낯설다. c.accept하면 출력문이 나오는데
    c.accept(i); 코드를 작성하고 나니 어? 출력은 어떻게 해야되지라고 순간 생각했다.
 */
public class _02함수형인터페이스 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.println(i + ", ");
        Predicate<Integer> p = i -> i%2 == 0;
        Function<Integer, Integer> f = i -> i/10 * 10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);

        printEvenNum(p, c, list);
    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list){
        List<T> newList = new ArrayList<>(list.size());

        for (T i : list) newList.add(f.apply(i));

        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list){
        for (T i : list){
            if (p.test(i)) {
                c.accept(i);
            }
        }
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list){
        for (int i = 0; i < 10; i++){
            list.add(s.get());
        }
    }
}
