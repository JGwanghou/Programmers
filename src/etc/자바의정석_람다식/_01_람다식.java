package etc.자바의정석_람다식;

public class _01_람다식 {
    public static void main(String[] args) {

//        MyFunction2 obj = new MyFunction2(){
//            public int max(int a, int b){
//                return a > b ? a : b;
//            }
//        };
        MyFunction2 f = (a, b) -> a > b ? a : b; // 람다식 익명객체

        int value = f.max(3, 5);
        System.out.println("value= " + value);
        /*
            Object 익명 객체를 생성했지만
            리모컨(Object)에는 max() 이란 메서드가 없다. 사용불가
         */
    }
}

@FunctionalInterface
interface MyFunction2 {
    int max(int a, int b);
}
