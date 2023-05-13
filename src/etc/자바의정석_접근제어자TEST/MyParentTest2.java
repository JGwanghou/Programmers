package etc.자바의정석_접근제어자TEST;
import etc.자바의정석_접근제어자.MyParent;

// 자손 클래스
class MyChild extends MyParent {

    public void printMembers(){

//        System.out.println(prv);
//        System.out.println(dft);
        System.out.println(protect);
        System.out.println(pub);
    }
}

// 전체
public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();

//        System.out.println(p.prv);
//        System.out.println(p.dft);
//        System.out.println(p.protect);
        System.out.println(p.pub);
    }
}
