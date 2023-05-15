package etc.연습문제;

/*
    실행결과를 적으시오.

    답 : 100 , 200

    멤버 변수의 경우 참조변수(리모컨)에 따라 값이 달라진다.
 */
class Parent1 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}
class Child1 extends Parent1 {
    int x = 200;
    void method() {
        System.out.println("Child Method");
    }
}

public class _07_20 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        Child1 c = new Child1();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }

}
