package state;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {
        Player player = new Player();

        Scanner s = new Scanner(System.in);

        loop1 : while (true) {
            System.out.println("플레이어의 상태: " + player.getState().getDescription() + " / 속도: " + player.getSpeed() + "km/h");
            System.out.print("[1]제자리 서기 [2]앉기 [3]걷기 [4]뛰기 [5]종료 : ");

            String input = s.next();
            System.out.println();

            switch (Integer.parseInt(input)) {
                case 1:
                    player.getState().standUp();
                    break;
                case 2:
                    player.getState().sitDown();
                    break;
                case 3:
                    player.getState().walk();
                    break;
                case 4:
                    player.getState().run();
                    break;
                case 5:
                    break loop1;
            }
        }

        s.close();
    }
}
