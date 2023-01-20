package factorymethod;


// 생성에 대한 인터페이스 부분과 생성에 대한 구현 부분이 분리되어 있다.
public abstract class Factory {

    public Item create(String name) {
        boolean bCreatable = this.isCreatable(name);
        if (bCreatable) {
            Item item = this.createItem(name);
            postprocessItem(name);
            return item;
        }
        return null;
    }

    protected abstract boolean isCreatable(String name);
    protected abstract Item createItem(String name);
    protected abstract void postprocessItem(String name);


}
