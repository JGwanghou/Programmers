package etc.자바의정석_쓰레드;

class _13_1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();
        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        /*
            어느것이 먼저 실행될지 모른다.
            OS 스케쥴러가 정한다. (불확실성)

            run()이 아니고 start()인 이유
             - 1. start()를 호출하면 새로운 호출스택을 만든다.
             - 2. | start |   |     |
                  | main  |   |     |
                  ㅡㅡㅡㅡㅡ    ㅡㅡㅡㅡ

             - 3. | start |   |     |
                  | main  |   | run |
                  ㅡㅡㅡㅡㅡ    ㅡㅡㅡㅡ

             - 4. | main  |   | run |
                  ㅡㅡㅡㅡㅡ    ㅡㅡㅡㅡ
             - 5. 그냥 run()을 실행하면 main 위에 쌓이기때문에 싱글쓰레드이다.
         */
    }
}

class ThreadEx1_1 extends Thread { // 1. Thread 클래스 상속해서 구현
    @Override
    public void run() { // 쓰레드가 수행할 작업 작성
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()); // 조상인 Thread의 getName()
        }
    }
}

class ThreadEx1_2 implements Runnable { // 2. Runnable 구현해서 쓰레드 구현
    @Override
    public void run() { // 쓰레드가 수행할 작업 작성
        for (int i = 0; i < 5; i++) {
            // 상속 받지 않은것은 밑에처럼 가져온다. Thread.currentThread() - 현재 실행중인 Thread 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}