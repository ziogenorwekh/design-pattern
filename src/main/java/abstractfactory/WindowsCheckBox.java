package abstractfactory;

public class WindowsCheckBox extends CheckBox {
    public WindowsCheckBox(boolean bChecked) {
        super(bChecked);
    }

    @Override
    public void render() {
        System.out.println(
                "Windows 랜더링 API를 이용해"
                + (this.bChecked ? "체크됨" : "체크 안됨")
                + " 체크 박스를 그립니다."
        );

    }
}

