package etc.연습문제;

/*
    Tv() {} 에러가 났던 이유

    Tv 인스턴스 생성시 생성자 Tv()를 호출한다.
    Tv()는 조상 생성자 super()를 호출한다. (컴파일러가 자동처리)
    super()는 조상클래스 생성자를 호출하는데 조상클래스에 생성자가 없었기 때문이다.
 */
class Product {
    int price;
    int bonusPoint;

    Product(){}

    Product(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv extends Product {

    Tv() {} // 에러

    public String toString() {
        return "Tv";
    }
}

public class _07_05 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
