package accessSpecifier;

public class SpecifierOutsideClass extends AccessSpecifier{

	public static void main(String[] args) 
	{
		SpecifierOutsideClass obj1 = new SpecifierOutsideClass();
		obj1.publicAccess();
		//obj1.privateAccess();  Cannot access from outside its respective Class
		obj1.protectedAccess();
		obj1.defaultAccess();
		
		//AccessSpecifier obj5 = new AccessSpecifier();
		

	}

}
