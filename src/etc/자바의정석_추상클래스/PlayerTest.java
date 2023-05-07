package etc.자바의정석_추상클래스;

abstract class Player { // 추상 클래스 (미완성 클래스, 미완성 설계도)
    abstract void play(int pos); // 추상메서드
    abstract void stop(); // 추상메서드 ( 선언부O, 구현부X)
}

// 추상클래스는 상속을 통해 완성해야함
class AudioPlayer extends Player{
    void play(int pos){
        System.out.println(pos+"위치 부터 play합니다");
    }
    void stop(){
        System.out.println("재생을 멈춥니다");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
//        Player p = new Player();

//        AudioPlayer ap = new AudioPlayer(); // Ok
        Player ap = new AudioPlayer(); // 다형성
        ap.play(100);
        ap.stop();
    }
}
