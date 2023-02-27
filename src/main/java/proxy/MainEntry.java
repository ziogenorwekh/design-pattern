package proxy;

public class MainEntry {
    public static void main(String[] args) {
        Display display = new BufferDisplay(3);

        display.print("안녕하세요.");
        display.print("GOF의 디자인 패턴");
        display.print("Proxy Pattern 입니다.");
        display.print("많은 관심");
        display.print("부탁드립니다.");
        display.print("반갑습니다.");

        ((BufferDisplay) display).flush();
    }
}
