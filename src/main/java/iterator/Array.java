package iterator;

public class Array implements Aggregator {

    private Item[] items;

    public Array(Item[] items) {
        this.items = items;
    }

    public Item getItem(int index) {
        return items[index];
    }

    // Iterator의 인터페이스의 구성 클래스인 ArrayIterator에서 사용한다.
    public int getCount() {
        return items.length;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }
}
