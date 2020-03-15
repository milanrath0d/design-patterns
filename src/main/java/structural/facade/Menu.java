package structural.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Menu pojo
 *
 * @author Milan Rathod
 */
@Data
@AllArgsConstructor
public class Menu {

    private String item;

    private int price;
}
