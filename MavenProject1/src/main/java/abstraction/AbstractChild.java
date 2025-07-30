//Accessing methods Using reference creation instead of  object of Child


package abstraction;

public class AbstractChild extends AbstractParent {

	public static void main(String[] args) {
		AbstractParent obj = new AbstractChild();
		obj.display();
		//obj.childsMethod();  This will not work. Can't access Child's methos using Parent's reference
		AbstractChild obj1 = new AbstractChild();
		obj1.childsMethod();

	}

	@Override
	public void display() {
	System.out.println("...From abstract method...");		
	}
	
	public void childsMethod()
	{
		System.out.println("...Child class method Can be called by Child class object only and not by parent's reference or Parents onject...");		
		}

}
