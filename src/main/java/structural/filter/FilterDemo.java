package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		
		Person p1=new Person("ABC", "Male", "Married");
		Person p2=new Person("DEF", "Male", "Unmarried");
		Person p3=new Person("GHI", "Male", "Unmarried");
		Person p4=new Person("JKL", "Male", "Married");
		Person p5=new Person("MNO", "Female", "Unarried");
		Person p6=new Person("PQR", "Female", "Married");
		List<Person> persons=new ArrayList<>();
		persons.add(p1);persons.add(p2);persons.add(p3);persons.add(p4);persons.add(p5);persons.add(p6);
		
		Criteria males=new MaleCriteria();
		
		Criteria females=new FemaleCriteria();

		
		Criteria married=new MarriedCriteria();
		
		Criteria unmarried=new UnmarriedCriteria();
		
		CriteriaAndCondition criteriaOr=new CriteriaAndCondition(males, unmarried);
		printPersons(criteriaOr.meetCriteria(persons));
		

	}
	
	private static void printPersons(List<Person> persons){
		for(Person person:persons){
			System.out.println("Name : "+person.getName()+" Gender : "+person.getGender()+" Marital Status : "+person.getMaritalStatus());
		}
	}

}
