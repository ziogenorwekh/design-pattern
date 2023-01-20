package bridge;

public class MainEntry {
    public static void main(String[] args) {
        String title = "복원된 지구";
        String author = "김형준";
        String[] content = {
                "플라스틱 사용의 감소와",
                "바다 생물 어획량 감소로 인하여",
                "지구는 복원되었다."
        };
        Draft draft = new Draft(title, author, content);

        Display display = new SimpleDisplay();
        draft.print(display);

        Display display1 = new CaptionDisplay();
        draft.print(display1);

        // 추가적인 정보를 추가할 때 기존의 드래프트 기능은 유지하고
        // 요구사항을 위해서 Publication 추가

        String publisher = "복악출판";
        int cost = 100;
        Publication publication = new Publication(title, author, content
                , publisher, cost);

        publication.print(display);
    }
}
