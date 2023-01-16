package template;

public abstract class DisplayArticleTemplate {
    protected Article article;

    public DisplayArticleTemplate(Article article) {
        this.article = article;
    }

    // 파생 클래스에서 이 메서드를 변경할 수 없도록 강제
    public final void display() {
        title();
        content();
        footer();
    }

    protected abstract void footer();
    protected abstract void content();
    protected abstract void title();
}
