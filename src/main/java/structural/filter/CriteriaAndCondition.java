package structural.filter;

import java.util.List;

public class CriteriaAndCondition implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public CriteriaAndCondition(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteria=criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteria);
	}

}
