package behavioral.strategy;

/**
 * Entry point for strategy design pattern
 *
 * @author Milan Rathod
 */
public class StrategyMain {

    public static void main(String[] args) {
        Application application = new Application();

        application.authenticate(new BasicAuthentication());
    }
}
