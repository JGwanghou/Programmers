package etc.egoing_상속;

class Cal {
    int v1,v2;
    Cal(int v1, int v2){
        System.out.println("Cal init!!!");
        this.v1 = v1; this.v2 = v2;
    }

    public int sum(){return this.v1 + this.v2;}
}

// 부모가 생성자가 있으면 자식도 생성자를 강제해야한다
class Cal3 extends Cal{

    Cal3(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal3 init");
    }

    public int minus(){return this.v1 - this.v2;}
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal(2, 1);
        Cal3 c3 = new Cal3(2, 1);

        System.out.println(c3.sum()); // 3
        System.out.println(c3.minus()); // 1
    }
}
