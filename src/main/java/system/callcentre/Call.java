package system.callcentre;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Milan Rathod
 */
@Getter
@AllArgsConstructor
@Setter
public class Call {

    private int rank;

    private Customer customer;
}
