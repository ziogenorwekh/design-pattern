package mediator;

import java.util.Scanner;

public class MainEntry {

    public static void main(String[] args) {
        SmartHome home = new SmartHome();
        Scanner s = new Scanner(System.in);

        do {
            home.report();

            System.out.println("[1] 문 열기");
            System.out.println("[2] 문 닫기");
            System.out.println("[3] 창문 열기");
            System.out.println("[4] 창문 닫기");
            System.out.println("[5] 에어컨 켜기");
            System.out.println("[6] 에어컨 끄기");
            System.out.println("[7] 보일러 켜기");
            System.out.println("[8] 보일러 끄기");
            System.out.println("[9] 종료");

            System.out.print("명령 : ");
            int i = s.nextInt();

            if (i == 1) home.door.open();
            else if(i == 2) home.door.close();
            else if(i == 3) home.window.open();
            else if(i == 4) home.window.close();
            else if(i == 5) home.aircon.on();
            else if(i == 6) home.aircon.off();
            else if(i == 7) home.boiler.on();
            else if(i == 8) home.boiler.off();
            else if(i == 9) break;
        } while (true);

        s.close();
    }
}
