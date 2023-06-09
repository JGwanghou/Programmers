package etc.자바의정석_람다식;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class _02함수형인터페이스 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.println(i + ", ");
        Predicate<Integer> p = i -> i%2 == 0;
        Function<Integer, Integer> f = i -> i/10 * 10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list){
        for (int i = 0; i < 10; i++){
            list.add(s.get());
        }
    }
}
