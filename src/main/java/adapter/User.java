package adapter;

import java.util.ArrayList;

public class User {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("댕이"));
        animals.add(new Cat("솜털이"));
        animals.add(new Cat("츄츄"));
        animals.add(new TigerAdapter("타이몬"));

        animals.forEach(animal -> animal.sound());
    }
}
