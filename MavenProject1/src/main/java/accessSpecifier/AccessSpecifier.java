package accessSpecifier;

public class AccessSpecifier {

	public static void main(String[] args)
	{
		AccessSpecifier obj = new AccessSpecifier();
		obj.publicAccess();
		obj.privateAccess();
		obj.protectedAccess();
		obj.defaultAccess();

	}
	
	public void publicAccess()
	{
		System.out.println("Public Method");
	}
	
	private void privateAccess()
	{
		System.out.println("Private Method");
	}
	
	protected void protectedAccess()
	{
		System.out.println("Protected Method");
	}
	
	void defaultAccess()
	{
		System.out.println("Default Method");
	}
	
}

