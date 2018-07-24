package behavioral.visitor;

public class Child implements Visitable {
	
	private String name;
	
	

	public String getName() {
		return name;
	}



	public Child(String name) {
		super();
		this.name = name;
	}



	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

}
