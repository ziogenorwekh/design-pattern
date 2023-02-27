package builder.type1;

import java.util.Random;

public class MainEntry {
    public static void main(String[] args) {
        Car car = new Car("V7", true, "Black", true, false);

        // Method Chaining
//        Car car1 = new CarBuilder()
//                .setAEB(false)
//                .setAirbag(false)
//                .setCameraSensor(true)
//                .setColor("White")
//                .setEngine("V9")
//                .build();
        CarBuilder builder = new CarBuilder()
                .setAEB(false)
//                .setAirbag(false)
                .setCameraSensor(true)
                .setColor("White")
                .setEngine("V9");

        Random random = new Random();
        Car car2 = builder.setAirbag(random.nextInt(2) == 0).build();

        System.out.println(car);
        System.out.println(car2);
//                .build();
    }
}
