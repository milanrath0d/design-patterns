package structural.composite;

public class CompositeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee("e1", 50000, "CEO");
		
		Employee e2=new Employee("e2", 30000, "Dev Manager");
		Employee e3=new Employee("e3", 25000, "QA Manager");
		
		Employee e4=new Employee("e4", 15000, "Dev Software Engineer");
		Employee e5=new Employee("e5", 15000, "Dev Software Engineer");
		Employee e6=new Employee("e6", 15000, "Dev Software Engineer");
		
		Employee e7=new Employee("e7", 10000, "QA Software Engineer");
		Employee e8=new Employee("e8", 10000, "QA Software Engineer");
		
		e1.addSubordinate(e2);e1.addSubordinate(e3);
		
		e2.addSubordinate(e4);e2.addSubordinate(e5);e2.addSubordinate(e6);
		
		e3.addSubordinate(e7);e3.addSubordinate(e8);
		
		printEmployees(e5);

	}
	
	private static void printEmployees(IfEmployee ifEmployee){
		if(ifEmployee instanceof Employee){
			Employee employee=(Employee) ifEmployee;
			System.out.println("Employee Name :"+employee.getName()+" Salary : "+employee.getDesignation()+" Salary : "+employee.yearlySalary());
			for(IfEmployee ifEmployee2:employee.getChilds()){
				if(ifEmployee2 instanceof Employee){
					Employee employeeObj=(Employee) ifEmployee2;
					System.out.println("Employee Name :"+employeeObj.getName()+" Salary : "+employeeObj.getDesignation()+" Salary : "+employeeObj.yearlySalary());
				}
				else {
					SoftwareEngineer softwareEngineer=(SoftwareEngineer) ifEmployee2;
					System.out.println("Employee Name :"+softwareEngineer.getName()+" Salary : "+softwareEngineer.getDesignation()+" Salary : "+softwareEngineer.yearlySalary());
				}
			}
		}
		else{
			System.out.println("Leaf Node!");
			SoftwareEngineer softwareEngineer=(SoftwareEngineer) ifEmployee;
			System.out.println("Employee Name :"+softwareEngineer.getName()+" Salary : "+softwareEngineer.getDesignation()+" Salary : "+softwareEngineer.yearlySalary());

		}
		
	}

}
