package etc.자바의정석_접근제어자;

// 같은 클래스
public class MyParent {
    private   int prv; // 같은클래스
              int dft; // 같은 패키지
    protected int protect; // 같은 패키지 + 자손(다른패키지)
    public    int pub; // 접근제한 없음.

    public void printMembers(){ // 메서드
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(protect);
        System.out.println(pub);
    }
}

// 같은 패키지
class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();

//        System.out.println(p.prv);
        System.out.println(p.dft);
        System.out.println(p.protect);
        System.out.println(p.pub);
    }
}
