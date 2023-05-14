package etc.연습문제;

/*
*   섯다카드 20장 보유
*   1~10 한 쌍
*   숫자 1, 3, 8일떄 광이어야한다 (isKwang = true)
*/

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        /*
        *   배열을 초기화 해보시오.
        */
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    void shuffle(){
        for (int x = 0; x < cards.length; x++) {
            int a = (int) Math.random() * cards.length;
            int b = (int) Math.random() * cards.length;

            SutdaCard tmp = cards[a];
            cards[a] = cards[b];
            cards[b] = tmp;
        }
    }

    SutdaCard pick(int index){
        if(index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }

    SutdaCard pick(){
        int randomNumber = (int)Math.random()*cards.length;
        return cards[randomNumber];
    }
}
class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object 클래스의 toString()을 오버라이딩 한다.
    public String toString() {
        return num + ( isKwang ? "K":"");
    }

}
public class _07_01 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");



    }
}

