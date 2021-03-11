package creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Milan Rathod
 */
public class Employees implements Cloneable {

    private final List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        //read all employees from database and put into the list
        empList.add("Test1");
        empList.add("Test2");
        empList.add("Test3");
        empList.add("Test4");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<>(this.getEmpList());
        return new Employees(temp);
    }
}
