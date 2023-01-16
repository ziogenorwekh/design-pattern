package singleton;

public class MainEntry {
    public static void main(String[] args) {
//        King king = new King();
        King king = King.getInstance();
        king.say();
        King king1 = King.getInstance();
        if (king == king1) {
            System.out.println("true");
        }
    }
}
