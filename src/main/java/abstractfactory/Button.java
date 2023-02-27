package abstractfactory;

public abstract class Button {
    protected String caption;

    public Button(String caption) {
        this.caption = caption;
    }

    public void clickEvent() {
        System.out.println(caption + " Button을 클릭하였습니다.");
    }

    public abstract void render();

}
