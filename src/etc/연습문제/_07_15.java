package etc.연습문제;
/*
    세 개의 클래스로부터 공통부분을 뽑아서 이라는 Unit클래스를 만들고, 이 클래스를 상속받도록 코드를 변경하시오
 */
abstract class Unit {
    int x,y;

    abstract void move(int x, int y);
    abstract void stop();
}

class Marine extends Unit{

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("마린은 x= " + x + "만큼" +"y= "+ y + "만큼 이동");
    }

    @Override
    void stop() {}
}

class Tank extends Unit {

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("탱크는 x= " + x + "만큼" +"y= "+ y + "만큼 이동");
    }

    @Override
    void stop() {}
}

class Dropship extends Unit {

    @Override
    void move(int x, int y) {}

    @Override
    void stop() {}

    void load() {
        System.out.println("드랍쉽의 load");
    }
    void unload(){
        System.out.println("드랍쉽의 unload");
    }
}

public class _07_15 {
    public static void main(String[] args) {
        Unit u = new Marine();
        Unit ut = new Tank();


        u.move(2,4);
        ut.move(5,6);

    }
}
