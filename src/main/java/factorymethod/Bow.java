package factorymethod;

public class Bow implements Item{
    @Override
    public void use() {
        System.out.println("활로 공격했다.");
    }
}
