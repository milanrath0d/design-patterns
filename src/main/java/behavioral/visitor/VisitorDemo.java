package behavioral.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		
		Visitor visitor=new ChildSpecialistDoctor("Dr. Sharma");
		
		Visitable priya=new Child("priya");
		Visitable sonu=new Child("sonu");
		
		priya.accept(visitor);

	}

}
