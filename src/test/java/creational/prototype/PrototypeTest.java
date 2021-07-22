package creational.prototype;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for prototype pattern
 *
 * @author Milan Rathod
 */
class PrototypeTest {

    @Test
    void testCopy() {
        Employees employees = new Employees();
        employees.loadData();

        //Use the clone method to get the Employee object
        Employees clonedEmployees = (Employees) employees.clone();
        List<String> list = clonedEmployees.getEmpList();
        list.add("John");

        assertEquals(4, employees.getEmpList().size());
        assertEquals(5, list.size());
    }

}