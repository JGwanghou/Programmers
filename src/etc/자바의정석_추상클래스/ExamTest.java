package etc.자바의정석_추상클래스;

abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){}
}

class Marine extends Unit{
    void move(int x, int y){
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack(){}
}

class Tank extends Unit{
    void move(int x, int y){
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
    void changeMode(){}
}

class Dropship extends Unit{
    void move(int x, int y){
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }
    void load(){}
    void unload(){}
}

public class ExamTest {
    public static void main(String[] args) {
        Unit[] group = new Unit[3];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Dropship();
        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}
