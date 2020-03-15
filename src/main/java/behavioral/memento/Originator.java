package behavioral.memento;

/**
 * Originator
 *
 * @author Milan Rathod
 */
public class Originator {

    private String article;

    public void set(String newArticle) {
        System.out.println("From originator: current version of article:  " + newArticle);
        article = newArticle;
    }

    public Memento save() {
        System.out.println("From originator: saving to memento");
        return new Memento(article);
    }

    public String restore(Memento memento) {
        article = memento.getArticle();
        System.out.println("From originator: previous article saved in memento: " + article);
        return article;
    }

    public static class Memento {

        private final String article;

        public Memento(String article) {
            this.article = article;
        }

        public String getArticle() {
            return article;
        }
    }
}
