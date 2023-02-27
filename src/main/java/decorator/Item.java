package decorator;

public abstract class Item {
    public abstract int getLinesCount();

    public abstract int getMaxLength();

    public abstract int getLength(int index);

    public abstract String getString(int index);
}
