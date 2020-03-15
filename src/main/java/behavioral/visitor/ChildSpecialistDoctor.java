package behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Milan Rathod
 */
@Data
@AllArgsConstructor
public class ChildSpecialistDoctor implements Visitor {

    private String name;

    @Override
    public void visit(Visitable visitable) {
        System.out.println("test");
    }

}
