package abstractfactory;


public class LinuxTextEdit extends TextEdit {
    public LinuxTextEdit(String value) {
        super(value);
    }

    @Override
    public void render() {

        System.out.println(
                "Linux 랜더링 API를 이용해"
                        + this.value + " 값을 가진"
                        + " 텍스트 에티더를 그립니다."
        );
    }
}
