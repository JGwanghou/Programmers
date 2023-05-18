package etc.자바의정석_StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("== Stack ==");
        while (!st.empty()){
            System.out.println(st.pop()); // Stack 요소 꺼내기
        }

        System.out.println("== Queue ==");
        while (!q.isEmpty()){
            System.out.println(q.poll()); // Queue 요소 꺼내기
        }
    }
}
