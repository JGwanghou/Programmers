package etc.자바의정석_인터페이스;

abstract class Unit {
    int x,y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable {
    void move(int x, int y);
    void attack(Fightable f); // Fightable를 구현한 것만 실행가능. Why? 매개변수에 Fightable가 들어갔고 추상메서드니까 ㅎㅎ
}

// 조상 Fightable
class Fighter extends Unit implements Fightable {

    // Unit 한테 받은 int x,y와 move() 메서드 숨어있음

    public void move(int x, int y){
        System.out.println("["+x+","+y+"]로 이동");
    };
    public void attack(Fightable f){
        System.out.println(f+"를 공격");
    };

    Fightable getFightable(){
        return new Fighter();
    }
}

public class FighterTest {
    public static void main(String[] args) {
//        Fighter fighter = new Fighter(); OK
        Fightable fighter = new Fighter(); // 참조변수(리모컨) --> 구현한 객체 사용가능. 단, 인터페이스 메서드만 사용가능
        fighter.move(2,3);
        fighter.attack(new Fighter());

        Fighter f = new Fighter();
        f.getFightable();

    }
}

/*
* 느낀 점
*
* 인터페이스를 구현한 클래스가 있다면
* 인터페이스 참조변수(리모컨)를 이용해서 다형성 가능하다.
* 하지만 구현 클래스의 메서드가 아무리 많아도 리모컨의 메소드만 사용할 수 있다
* */
