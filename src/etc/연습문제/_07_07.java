package etc.연습문제;

/*
* 다음 코드 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
*
* Child() -> Child(int x) -> Parent() -> Parent(int x) -> Object
*
* 1. getX()는 부모클래스에서 정의된 것이라서 x=200 출력
* 2. Child 클래스에서는 x=1000으로 되어있다.
* */

class Parent{
    int x = 100;

    Parent(){
        this(200);
    }

    Parent(int x){
                    // super(), Object를 의미
        this.x = x;
    }

    int getX(){
        return x;
    }
}

class Child extends Parent{
    int x = 3000;

    Child(){
        this(1000);
    }

    Child(int x){
                    // super(); 숨어있음
        this.x = x;
    }
}

public class _07_07 {
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println("x=" + c.getX());
    }
}
