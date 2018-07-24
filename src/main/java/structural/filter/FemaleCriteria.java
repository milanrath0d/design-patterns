package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> males=new ArrayList<Person>();
		for(Person person:persons){
			if(person.getGender().equalsIgnoreCase("female")){
				males.add(person);
			}
		}
		return males;
	
	}

}
