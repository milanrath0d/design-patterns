package behavioral.visitor;

/**
 * Entry point for visitor design pattern
 *
 * @author Milan Rathod
 */
public class VisitorMain {

    public static void main(String[] args) {

        Visitor visitor = new ChildSpecialistDoctor("Dr. Sharma");

        Visitable priya = new Child("priya");
        Visitable sonu = new Child("sonu");

        priya.accept(visitor);
    }

}
