package accessSpecifierOutsidePackage;

import accessSpecifier.AccessSpecifier;

public class AccessSpecifierView extends AccessSpecifier{

	public static void main(String[] args) 
	{
		AccessSpecifierView obj2 = new AccessSpecifierView();
		obj2.publicAccess();
		obj2.protectedAccess(); // can be accessed only through child object
		//obj2.privateAccess(); Cannot be accessed outside respective package
		//obj2.defaultAccess(); Cannot be accessed outside respective package

		AccessSpecifier obj3 = new AccessSpecifier();
		obj3.publicAccess();
	//	obj3.protectedAccess();can be accessed only through Child Class object
		
	}

}
