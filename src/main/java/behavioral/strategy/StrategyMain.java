package behavioral.strategy;

/**
 * Entry point for strategy design pattern
 *
 * @author Milan Rathod
 */
public class StrategyMain {

    public static void main(String[] args) {
        Application browser = new Browser();
        Application postman = new Postman();

        browser.authenticate();
        postman.authenticate();

        postman.setAuthentication(new BasicAuthentication());

        postman.authenticate();
    }
}
