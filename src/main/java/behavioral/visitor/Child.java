package behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Milan Rathod
 */
@Getter
@Setter
@AllArgsConstructor
public class Child implements Visitable {

    private String name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
