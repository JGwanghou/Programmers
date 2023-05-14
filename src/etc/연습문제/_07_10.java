package etc.연습문제;

/*
    MyTv2 클래스 멤버변수를 외부에서 접근할 수 없도록 하는 대신
    멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 하라.
*/
class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setVolume(int volume){
        if(volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    public void setChannel(int channel){
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;
        this.channel = channel;
    }
    public int getChannel() {
        return channel;
    }
}

public class _07_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());

        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());

    }
}
