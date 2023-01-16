package iterator;

public class MainEntry {

    public static void main(String[] args) {
        Item[] items = {
                new Item("CPU", 1000),
                new Item("Keyboard", 2000),
                new Item("Mouse", 3000),
                new Item("HDD", 50),

        };

        Array array = new Array(items);
        Iterator iterator = array.iterator();

        while (iterator.next()) {
            Item item = (Item) iterator.current();
            System.out.println("item = " + item);
        }
    }
}
