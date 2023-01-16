package singleton;

public class King {
    private King() {}

    private static King self = null;

    // synchronized 를 걸어준 이유는
    // 멀티 쓰레드에서 실행되도 문제 없도록 하기 위함
    public synchronized static King getInstance() {
        if (self == null) {
            self = new King();
        }
        return self;
    }

    public void say() {
        System.out.println("Hi");
    }
}
